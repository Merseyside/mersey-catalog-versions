package org.gradle.accessors.dm;

import org.gradle.api.NonNullApi;
import org.gradle.api.artifacts.MinimalExternalModuleDependency;
import org.gradle.plugin.use.PluginDependency;
import org.gradle.api.artifacts.ExternalModuleDependencyBundle;
import org.gradle.api.artifacts.MutableVersionConstraint;
import org.gradle.api.provider.Provider;
import org.gradle.api.model.ObjectFactory;
import org.gradle.api.provider.ProviderFactory;
import org.gradle.api.internal.catalog.AbstractExternalDependencyFactory;
import org.gradle.api.internal.catalog.DefaultVersionCatalog;
import java.util.Map;
import org.gradle.api.internal.attributes.ImmutableAttributesFactory;
import org.gradle.api.internal.artifacts.dsl.CapabilityNotationParser;
import javax.inject.Inject;

/**
 * A catalog of dependencies accessible via the `common` extension.
 */
@NonNullApi
public class LibrariesForCommon extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final KotlinLibraryAccessors laccForKotlinLibraryAccessors = new KotlinLibraryAccessors(owner);
    private final MerseyLibraryAccessors laccForMerseyLibraryAccessors = new MerseyLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForCommon(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for coroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * This dependency was declared in catalog common.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoroutines() {
            return create("coroutines");
    }

        /**
         * Creates a dependency provider for serialization (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * This dependency was declared in catalog common.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSerialization() {
            return create("serialization");
    }

    /**
     * Returns the group of libraries at kotlin
     */
    public KotlinLibraryAccessors getKotlin() {
        return laccForKotlinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mersey
     */
    public MerseyLibraryAccessors getMersey() {
        return laccForMerseyLibraryAccessors;
    }

    /**
     * Returns the group of versions at versions
     */
    public VersionAccessors getVersions() {
        return vaccForVersionAccessors;
    }

    /**
     * Returns the group of bundles at bundles
     */
    public BundleAccessors getBundles() {
        return baccForBundleAccessors;
    }

    /**
     * Returns the group of plugins at plugins
     */
    public PluginAccessors getPlugins() {
        return paccForPluginAccessors;
    }

    public static class KotlinLibraryAccessors extends SubDependencyFactory {

        public KotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for reflect (org.jetbrains.kotlin:kotlin-reflect)
             * This dependency was declared in catalog common.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getReflect() {
                return create("kotlin.reflect");
        }

            /**
             * Creates a dependency provider for stdlib (org.jetbrains.kotlin:kotlin-stdlib-jdk8)
             * This dependency was declared in catalog common.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getStdlib() {
                return create("kotlin.stdlib");
        }

    }

    public static class MerseyLibraryAccessors extends SubDependencyFactory {
        private final MerseyKotlinLibraryAccessors laccForMerseyKotlinLibraryAccessors = new MerseyKotlinLibraryAccessors(owner);
        private final MerseyTimeLibraryAccessors laccForMerseyTimeLibraryAccessors = new MerseyTimeLibraryAccessors(owner);

        public MerseyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at mersey.kotlin
         */
        public MerseyKotlinLibraryAccessors getKotlin() {
            return laccForMerseyKotlinLibraryAccessors;
        }

        /**
         * Returns the group of libraries at mersey.time
         */
        public MerseyTimeLibraryAccessors getTime() {
            return laccForMerseyTimeLibraryAccessors;
        }

    }

    public static class MerseyKotlinLibraryAccessors extends SubDependencyFactory {

        public MerseyKotlinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ext (io.github.merseyside:kotlin-ext)
             * This dependency was declared in catalog common.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExt() {
                return create("mersey.kotlin.ext");
        }

    }

    public static class MerseyTimeLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MerseyTimeLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for time (io.github.merseyside:time)
             * This dependency was declared in catalog common.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("mersey.time");
        }

            /**
             * Creates a dependency provider for coroutines (io.github.merseyside:time-coroutine-ext)
             * This dependency was declared in catalog common.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() {
                return create("mersey.time.coroutines");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final MerseyVersionAccessors vaccForMerseyVersionAccessors = new MerseyVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: serialization (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getSerialization() { return getVersion("serialization"); }

            /**
             * Returns the version associated to this alias: versionChecker (0.39.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getVersionChecker() { return getVersion("versionChecker"); }

        /**
         * Returns the group of versions at versions.mersey
         */
        public MerseyVersionAccessors getMersey() {
            return vaccForMerseyVersionAccessors;
        }

    }

    public static class MerseyVersionAccessors extends VersionFactory  {

        private final MerseyKotlinVersionAccessors vaccForMerseyKotlinVersionAccessors = new MerseyKotlinVersionAccessors(providers, config);
        public MerseyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.time (1.1.9)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getTime() { return getVersion("mersey.time"); }

        /**
         * Returns the group of versions at versions.mersey.kotlin
         */
        public MerseyKotlinVersionAccessors getKotlin() {
            return vaccForMerseyKotlinVersionAccessors;
        }

    }

    public static class MerseyKotlinVersionAccessors extends VersionFactory  {

        public MerseyKotlinVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.kotlin.ext (1.2.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog common.versions.toml
             */
            public Provider<String> getExt() { return getVersion("mersey.kotlin.ext"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final MerseyBundleAccessors baccForMerseyBundleAccessors = new MerseyBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

        /**
         * Returns the group of bundles at bundles.mersey
         */
        public MerseyBundleAccessors getMersey() {
            return baccForMerseyBundleAccessors;
        }

    }

    public static class MerseyBundleAccessors extends BundleFactory {

        public MerseyBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for mersey.time which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.github.merseyside:time</li>
             *    <li>io.github.merseyside:time-coroutine-ext</li>
             * </ul>
             * This bundle was declared in catalog common.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getTime() {
                return createBundle("mersey.time");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Creates a plugin provider for versionChecker to the plugin id 'com.github.ben-manes.versions'
             * This plugin was declared in catalog common.versions.toml
             */
            public Provider<PluginDependency> getVersionChecker() { return createPlugin("versionChecker"); }

    }

}
