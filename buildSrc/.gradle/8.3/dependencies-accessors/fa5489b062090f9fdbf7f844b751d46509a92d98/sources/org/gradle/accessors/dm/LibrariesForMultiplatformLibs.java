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
 * A catalog of dependencies accessible via the `multiplatformLibs` extension.
 */
@NonNullApi
public class LibrariesForMultiplatformLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final KuuuurtLibraryAccessors laccForKuuuurtLibraryAccessors = new KuuuurtLibraryAccessors(owner);
    private final MerseyLibraryAccessors laccForMerseyLibraryAccessors = new MerseyLibraryAccessors(owner);
    private final MokoLibraryAccessors laccForMokoLibraryAccessors = new MokoLibraryAccessors(owner);
    private final SqldelightLibraryAccessors laccForSqldelightLibraryAccessors = new SqldelightLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForMultiplatformLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for bignum (com.soywiz.korlibs.kbignum:kbignum)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBignum() {
            return create("bignum");
    }

        /**
         * Creates a dependency provider for coroutines (org.jetbrains.kotlinx:kotlinx-coroutines-core)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoroutines() {
            return create("coroutines");
    }

        /**
         * Creates a dependency provider for koin (io.insert-koin:koin-core)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKoin() {
            return create("koin");
    }

        /**
         * Creates a dependency provider for serialization (org.jetbrains.kotlinx:kotlinx-serialization-json)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSerialization() {
            return create("serialization");
    }

        /**
         * Creates a dependency provider for settings (com.russhwolf:multiplatform-settings)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getSettings() {
            return create("settings");
    }

        /**
         * Creates a dependency provider for uuid (com.benasher44:uuid)
         * This dependency was declared in catalog multiplatform.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getUuid() {
            return create("uuid");
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
    }

    /**
     * Returns the group of libraries at kuuuurt
     */
    public KuuuurtLibraryAccessors getKuuuurt() {
        return laccForKuuuurtLibraryAccessors;
    }

    /**
     * Returns the group of libraries at mersey
     */
    public MerseyLibraryAccessors getMersey() {
        return laccForMerseyLibraryAccessors;
    }

    /**
     * Returns the group of libraries at moko
     */
    public MokoLibraryAccessors getMoko() {
        return laccForMokoLibraryAccessors;
    }

    /**
     * Returns the group of libraries at sqldelight
     */
    public SqldelightLibraryAccessors getSqldelight() {
        return laccForSqldelightLibraryAccessors;
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

    public static class KtorLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktor (io.ktor:ktor-client-core)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("ktor");
        }

            /**
             * Creates a dependency provider for auth (io.ktor:ktor-client-auth)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAuth() {
                return create("ktor.auth");
        }

            /**
             * Creates a dependency provider for logging (io.ktor:ktor-client-logging)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLogging() {
                return create("ktor.logging");
        }

    }

    public static class KuuuurtLibraryAccessors extends SubDependencyFactory {

        public KuuuurtLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for paging (io.github.kuuuurt:multiplatform-paging)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() {
                return create("kuuuurt.paging");
        }

    }

    public static class MerseyLibraryAccessors extends SubDependencyFactory {

        public MerseyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for archy (io.github.merseyside:archy-core)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getArchy() {
                return create("mersey.archy");
        }

            /**
             * Creates a dependency provider for oauth (io.github.merseyside:oauth-core)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOauth() {
                return create("mersey.oauth");
        }

            /**
             * Creates a dependency provider for pagination (io.github.merseyside:pagination)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPagination() {
                return create("mersey.pagination");
        }

            /**
             * Creates a dependency provider for utils (io.github.merseyside:utils-core)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUtils() {
                return create("mersey.utils");
        }

    }

    public static class MokoLibraryAccessors extends SubDependencyFactory {
        private final MokoMapsLibraryAccessors laccForMokoMapsLibraryAccessors = new MokoMapsLibraryAccessors(owner);
        private final MokoMvvmLibraryAccessors laccForMokoMvvmLibraryAccessors = new MokoMvvmLibraryAccessors(owner);

        public MokoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for kswift (dev.icerock.moko:kswift-runtime)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKswift() {
                return create("moko.kswift");
        }

            /**
             * Creates a dependency provider for paging (dev.icerock.moko:paging)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() {
                return create("moko.paging");
        }

            /**
             * Creates a dependency provider for resources (dev.icerock.moko:resources)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getResources() {
                return create("moko.resources");
        }

        /**
         * Returns the group of libraries at moko.maps
         */
        public MokoMapsLibraryAccessors getMaps() {
            return laccForMokoMapsLibraryAccessors;
        }

        /**
         * Returns the group of libraries at moko.mvvm
         */
        public MokoMvvmLibraryAccessors getMvvm() {
            return laccForMokoMvvmLibraryAccessors;
        }

    }

    public static class MokoMapsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MokoMapsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for maps (dev.icerock.moko:maps)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("moko.maps");
        }

            /**
             * Creates a dependency provider for google (dev.icerock.moko:maps-google)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGoogle() {
                return create("moko.maps.google");
        }

    }

    public static class MokoMvvmLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MokoMvvmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for mvvm (dev.icerock.moko:mvvm-core)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("moko.mvvm");
        }

            /**
             * Creates a dependency provider for livedata (dev.icerock.moko:mvvm-livedata)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getLivedata() {
                return create("moko.mvvm.livedata");
        }

    }

    public static class SqldelightLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SqldelightLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sqldelight (com.squareup.sqldelight:runtime)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("sqldelight");
        }

            /**
             * Creates a dependency provider for coroutines (com.squareup.sqldelight:coroutines-extensions)
             * This dependency was declared in catalog multiplatform.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() {
                return create("sqldelight.coroutines");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final MerseyVersionAccessors vaccForMerseyVersionAccessors = new MerseyVersionAccessors(providers, config);
        private final MokoVersionAccessors vaccForMokoVersionAccessors = new MokoVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: bignum (2.5.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getBignum() { return getVersion("bignum"); }

            /**
             * Returns the version associated to this alias: coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: koin (3.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getKoin() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: ktor (2.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: paging (0.4.6)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("paging"); }

            /**
             * Returns the version associated to this alias: serialization (1.5.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getSerialization() { return getVersion("serialization"); }

            /**
             * Returns the version associated to this alias: settings (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getSettings() { return getVersion("settings"); }

            /**
             * Returns the version associated to this alias: sqldelight (1.5.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getSqldelight() { return getVersion("sqldelight"); }

            /**
             * Returns the version associated to this alias: uuid (0.3.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getUuid() { return getVersion("uuid"); }

            /**
             * Returns the version associated to this alias: versionChecker (0.39.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getVersionChecker() { return getVersion("versionChecker"); }

        /**
         * Returns the group of versions at versions.mersey
         */
        public MerseyVersionAccessors getMersey() {
            return vaccForMerseyVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.moko
         */
        public MokoVersionAccessors getMoko() {
            return vaccForMokoVersionAccessors;
        }

    }

    public static class MerseyVersionAccessors extends VersionFactory  {

        public MerseyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.kmm (1.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getKmm() { return getVersion("mersey.kmm"); }

            /**
             * Returns the version associated to this alias: mersey.oauth (1.0.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getOauth() { return getVersion("mersey.oauth"); }

            /**
             * Returns the version associated to this alias: mersey.pagination (0.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getPagination() { return getVersion("mersey.pagination"); }

    }

    public static class MokoVersionAccessors extends VersionFactory  {

        public MokoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: moko.kswift (0.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getKswift() { return getVersion("moko.kswift"); }

            /**
             * Returns the version associated to this alias: moko.maps (0.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getMaps() { return getVersion("moko.maps"); }

            /**
             * Returns the version associated to this alias: moko.mvvm (0.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getMvvm() { return getVersion("moko.mvvm"); }

            /**
             * Returns the version associated to this alias: moko.paging (0.7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("moko.paging"); }

            /**
             * Returns the version associated to this alias: moko.resources (0.23.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog multiplatform.versions.toml
             */
            public Provider<String> getResources() { return getVersion("moko.resources"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final MokoBundleAccessors baccForMokoBundleAccessors = new MokoBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for ktor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.ktor:ktor-client-core</li>
             *    <li>io.ktor:ktor-client-logging</li>
             *    <li>io.ktor:ktor-client-auth</li>
             * </ul>
             * This bundle was declared in catalog multiplatform.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKtor() {
                return createBundle("ktor");
            }

            /**
             * Creates a dependency bundle provider for merseyLibs which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.github.merseyside:archy-core</li>
             *    <li>io.github.merseyside:utils-core</li>
             * </ul>
             * This bundle was declared in catalog multiplatform.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMerseyLibs() {
                return createBundle("merseyLibs");
            }

        /**
         * Returns the group of bundles at bundles.moko
         */
        public MokoBundleAccessors getMoko() {
            return baccForMokoBundleAccessors;
        }

    }

    public static class MokoBundleAccessors extends BundleFactory {

        public MokoBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for moko.mvvm which is an aggregate for the following dependencies:
             * <ul>
             *    <li>dev.icerock.moko:mvvm-core</li>
             *    <li>dev.icerock.moko:mvvm-livedata</li>
             * </ul>
             * This bundle was declared in catalog multiplatform.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMvvm() {
                return createBundle("moko.mvvm");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
