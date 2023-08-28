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
 * A catalog of dependencies accessible via the `androidLibs` extension.
 */
@NonNullApi
public class LibrariesForAndroidLibs extends AbstractExternalDependencyFactory {

    private final AbstractExternalDependencyFactory owner = this;
    private final AndroidxLibraryAccessors laccForAndroidxLibraryAccessors = new AndroidxLibraryAccessors(owner);
    private final CameraLibraryAccessors laccForCameraLibraryAccessors = new CameraLibraryAccessors(owner);
    private final CoilLibraryAccessors laccForCoilLibraryAccessors = new CoilLibraryAccessors(owner);
    private final DaggerLibraryAccessors laccForDaggerLibraryAccessors = new DaggerLibraryAccessors(owner);
    private final EmojiLibraryAccessors laccForEmojiLibraryAccessors = new EmojiLibraryAccessors(owner);
    private final FirebaseLibraryAccessors laccForFirebaseLibraryAccessors = new FirebaseLibraryAccessors(owner);
    private final GlanceLibraryAccessors laccForGlanceLibraryAccessors = new GlanceLibraryAccessors(owner);
    private final GrpcLibraryAccessors laccForGrpcLibraryAccessors = new GrpcLibraryAccessors(owner);
    private final KoinLibraryAccessors laccForKoinLibraryAccessors = new KoinLibraryAccessors(owner);
    private final KtorLibraryAccessors laccForKtorLibraryAccessors = new KtorLibraryAccessors(owner);
    private final MerseyLibraryAccessors laccForMerseyLibraryAccessors = new MerseyLibraryAccessors(owner);
    private final MokoLibraryAccessors laccForMokoLibraryAccessors = new MokoLibraryAccessors(owner);
    private final RetrofitLibraryAccessors laccForRetrofitLibraryAccessors = new RetrofitLibraryAccessors(owner);
    private final RoomLibraryAccessors laccForRoomLibraryAccessors = new RoomLibraryAccessors(owner);
    private final SecurityLibraryAccessors laccForSecurityLibraryAccessors = new SecurityLibraryAccessors(owner);
    private final SqldelightLibraryAccessors laccForSqldelightLibraryAccessors = new SqldelightLibraryAccessors(owner);
    private final VersionAccessors vaccForVersionAccessors = new VersionAccessors(providers, config);
    private final BundleAccessors baccForBundleAccessors = new BundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
    private final PluginAccessors paccForPluginAccessors = new PluginAccessors(providers, config);

    @Inject
    public LibrariesForAndroidLibs(DefaultVersionCatalog config, ProviderFactory providers, ObjectFactory objects, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) {
        super(config, providers, objects, attributesFactory, capabilityNotationParser);
    }

        /**
         * Creates a dependency provider for activityKtx (androidx.activity:activity-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getActivityKtx() {
            return create("activityKtx");
    }

        /**
         * Creates a dependency provider for appCompat (androidx.appcompat:appcompat)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAppCompat() {
            return create("appCompat");
    }

        /**
         * Creates a dependency provider for asyncLayoutInflater (androidx.asynclayoutinflater:asynclayoutinflater)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getAsyncLayoutInflater() {
            return create("asyncLayoutInflater");
    }

        /**
         * Creates a dependency provider for billing (com.android.billingclient:billing-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBilling() {
            return create("billing");
    }

        /**
         * Creates a dependency provider for bouncyCastle (org.bouncycastle:bcpkix-jdk15on)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getBouncyCastle() {
            return create("bouncyCastle");
    }

        /**
         * Creates a dependency provider for cardView (androidx.cardview:cardview)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCardView() {
            return create("cardView");
    }

        /**
         * Creates a dependency provider for cicerone (com.github.terrakok:cicerone)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCicerone() {
            return create("cicerone");
    }

        /**
         * Creates a dependency provider for constraintLayout (androidx.constraintlayout:constraintlayout)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getConstraintLayout() {
            return create("constraintLayout");
    }

        /**
         * Creates a dependency provider for coroutines (org.jetbrains.kotlinx:kotlinx-coroutines-android)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getCoroutines() {
            return create("coroutines");
    }

        /**
         * Creates a dependency provider for desugarJdk (com.android.tools:desugar_jdk_libs)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getDesugarJdk() {
            return create("desugarJdk");
    }

        /**
         * Creates a dependency provider for flexBox (com.google.android.flexbox:flexbox)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFlexBox() {
            return create("flexBox");
    }

        /**
         * Creates a dependency provider for fragment (androidx.fragment:fragment-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getFragment() {
            return create("fragment");
    }

        /**
         * Creates a dependency provider for gson (com.google.code.gson:gson)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getGson() {
            return create("gson");
    }

        /**
         * Creates a dependency provider for keyboard (net.yslibrary.keyboardvisibilityevent:keyboardvisibilityevent)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getKeyboard() {
            return create("keyboard");
    }

        /**
         * Creates a dependency provider for lifecycleLiveDataKtx (androidx.lifecycle:lifecycle-livedata-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLifecycleLiveDataKtx() {
            return create("lifecycleLiveDataKtx");
    }

        /**
         * Creates a dependency provider for lifecycleRuntime (androidx.lifecycle:lifecycle-runtime-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLifecycleRuntime() {
            return create("lifecycleRuntime");
    }

        /**
         * Creates a dependency provider for lifecycleViewModel (androidx.lifecycle:lifecycle-viewmodel-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLifecycleViewModel() {
            return create("lifecycleViewModel");
    }

        /**
         * Creates a dependency provider for lifecycleViewModelSavedState (androidx.lifecycle:lifecycle-viewmodel-savedstate)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLifecycleViewModelSavedState() {
            return create("lifecycleViewModelSavedState");
    }

        /**
         * Creates a dependency provider for location (com.google.android.gms:play-services-location)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getLocation() {
            return create("location");
    }

        /**
         * Creates a dependency provider for material (com.google.android.material:material)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getMaterial() {
            return create("material");
    }

        /**
         * Creates a dependency provider for navigation (androidx.navigation:navigation-fragment-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNavigation() {
            return create("navigation");
    }

        /**
         * Creates a dependency provider for navigationUi (androidx.navigation:navigation-ui-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getNavigationUi() {
            return create("navigationUi");
    }

        /**
         * Creates a dependency provider for oauth2 (com.google.auth:google-auth-library-oauth2-http)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getOauth2() {
            return create("oauth2");
    }

        /**
         * Creates a dependency provider for paging (androidx.paging:paging-runtime)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPaging() {
            return create("paging");
    }

        /**
         * Creates a dependency provider for phoneValidator (com.googlecode.libphonenumber:libphonenumber)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPhoneValidator() {
            return create("phoneValidator");
    }

        /**
         * Creates a dependency provider for playCore (com.google.android.play:core)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPlayCore() {
            return create("playCore");
    }

        /**
         * Creates a dependency provider for publisher (com.google.apis:google-api-services-androidpublisher)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getPublisher() {
            return create("publisher");
    }

        /**
         * Creates a dependency provider for recyclerView (androidx.recyclerview:recyclerview)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRecyclerView() {
            return create("recyclerView");
    }

        /**
         * Creates a dependency provider for rxjava2 (io.reactivex.rxjava2:rxjava)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getRxjava2() {
            return create("rxjava2");
    }

        /**
         * Creates a dependency provider for typedDataStore (androidx.datastore:datastore)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getTypedDataStore() {
            return create("typedDataStore");
    }

        /**
         * Creates a dependency provider for worker (androidx.work:work-runtime-ktx)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getWorker() {
            return create("worker");
    }

        /**
         * Creates a dependency provider for zip4j (net.lingala.zip4j:zip4j)
         * This dependency was declared in catalog android.versions.toml
         */
        public Provider<MinimalExternalModuleDependency> getZip4j() {
            return create("zip4j");
    }

    /**
     * Returns the group of libraries at androidx
     */
    public AndroidxLibraryAccessors getAndroidx() {
        return laccForAndroidxLibraryAccessors;
    }

    /**
     * Returns the group of libraries at camera
     */
    public CameraLibraryAccessors getCamera() {
        return laccForCameraLibraryAccessors;
    }

    /**
     * Returns the group of libraries at coil
     */
    public CoilLibraryAccessors getCoil() {
        return laccForCoilLibraryAccessors;
    }

    /**
     * Returns the group of libraries at dagger
     */
    public DaggerLibraryAccessors getDagger() {
        return laccForDaggerLibraryAccessors;
    }

    /**
     * Returns the group of libraries at emoji
     */
    public EmojiLibraryAccessors getEmoji() {
        return laccForEmojiLibraryAccessors;
    }

    /**
     * Returns the group of libraries at firebase
     */
    public FirebaseLibraryAccessors getFirebase() {
        return laccForFirebaseLibraryAccessors;
    }

    /**
     * Returns the group of libraries at glance
     */
    public GlanceLibraryAccessors getGlance() {
        return laccForGlanceLibraryAccessors;
    }

    /**
     * Returns the group of libraries at grpc
     */
    public GrpcLibraryAccessors getGrpc() {
        return laccForGrpcLibraryAccessors;
    }

    /**
     * Returns the group of libraries at koin
     */
    public KoinLibraryAccessors getKoin() {
        return laccForKoinLibraryAccessors;
    }

    /**
     * Returns the group of libraries at ktor
     */
    public KtorLibraryAccessors getKtor() {
        return laccForKtorLibraryAccessors;
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
     * Returns the group of libraries at retrofit
     */
    public RetrofitLibraryAccessors getRetrofit() {
        return laccForRetrofitLibraryAccessors;
    }

    /**
     * Returns the group of libraries at room
     */
    public RoomLibraryAccessors getRoom() {
        return laccForRoomLibraryAccessors;
    }

    /**
     * Returns the group of libraries at security
     */
    public SecurityLibraryAccessors getSecurity() {
        return laccForSecurityLibraryAccessors;
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

    public static class AndroidxLibraryAccessors extends SubDependencyFactory {

        public AndroidxLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (androidx.core:core-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("androidx.core");
        }

    }

    public static class CameraLibraryAccessors extends SubDependencyFactory {

        public CameraLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for vision (com.google.android.gms:play-services-vision)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVision() {
                return create("camera.vision");
        }

    }

    public static class CoilLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public CoilLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coil (io.coil-kt:coil)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("coil");
        }

            /**
             * Creates a dependency provider for gif (io.coil-kt:coil-gif)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getGif() {
                return create("coil.gif");
        }

            /**
             * Creates a dependency provider for svg (io.coil-kt:coil-svg)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSvg() {
                return create("coil.svg");
        }

            /**
             * Creates a dependency provider for video (io.coil-kt:coil-video)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getVideo() {
                return create("coil.video");
        }

    }

    public static class DaggerLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public DaggerLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for dagger (com.google.dagger:dagger)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("dagger");
        }

            /**
             * Creates a dependency provider for compiler (com.google.dagger:dagger-compiler)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("dagger.compiler");
        }

    }

    public static class EmojiLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final EmojiViewsLibraryAccessors laccForEmojiViewsLibraryAccessors = new EmojiViewsLibraryAccessors(owner);

        public EmojiLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for emoji (androidx.emoji2:emoji2)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("emoji");
        }

        /**
         * Returns the group of libraries at emoji.views
         */
        public EmojiViewsLibraryAccessors getViews() {
            return laccForEmojiViewsLibraryAccessors;
        }

    }

    public static class EmojiViewsLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public EmojiViewsLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for views (androidx.emoji2:emoji2-views)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("emoji.views");
        }

            /**
             * Creates a dependency provider for helper (androidx.emoji2:emoji2-views-helper)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getHelper() {
                return create("emoji.views.helper");
        }

    }

    public static class FirebaseLibraryAccessors extends SubDependencyFactory {

        public FirebaseLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for analytics (com.google.firebase:firebase-analytics-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnalytics() {
                return create("firebase.analytics");
        }

            /**
             * Creates a dependency provider for bom (com.google.firebase:firebase-bom)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getBom() {
                return create("firebase.bom");
        }

            /**
             * Creates a dependency provider for config (com.google.firebase:firebase-config-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConfig() {
                return create("firebase.config");
        }

            /**
             * Creates a dependency provider for core (com.google.firebase:firebase-core)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("firebase.core");
        }

            /**
             * Creates a dependency provider for crashlytics (com.google.firebase:firebase-crashlytics-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrashlytics() {
                return create("firebase.crashlytics");
        }

            /**
             * Creates a dependency provider for firestore (com.google.firebase:firebase-firestore-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFirestore() {
                return create("firebase.firestore");
        }

            /**
             * Creates a dependency provider for messaging (com.google.firebase:firebase-messaging-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMessaging() {
                return create("firebase.messaging");
        }

    }

    public static class GlanceLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public GlanceLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for glance (androidx.glance:glance-appwidget)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("glance");
        }

            /**
             * Creates a dependency provider for appwidget (androidx.glance:glance-appwidget)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAppwidget() {
                return create("glance.appwidget");
        }

    }

    public static class GrpcLibraryAccessors extends SubDependencyFactory {

        public GrpcLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for core (io.grpc:grpc-core)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCore() {
                return create("grpc.core");
        }

            /**
             * Creates a dependency provider for okhttp (io.grpc:grpc-okhttp)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("grpc.okhttp");
        }

    }

    public static class KoinLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KoinLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for koin (io.insert-koin:koin-android)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("koin");
        }

            /**
             * Creates a dependency provider for navigation (io.insert-koin:koin-androidx-navigation)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getNavigation() {
                return create("koin.navigation");
        }

    }

    public static class KtorLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public KtorLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ktor (io.ktor:ktor-client-android)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("ktor");
        }

            /**
             * Creates a dependency provider for okhttp (io.ktor:ktor-client-okhttp)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOkhttp() {
                return create("ktor.okhttp");
        }

    }

    public static class MerseyLibraryAccessors extends SubDependencyFactory {
        private final MerseyAdaptersLibraryAccessors laccForMerseyAdaptersLibraryAccessors = new MerseyAdaptersLibraryAccessors(owner);
        private final MerseyArchyLibraryAccessors laccForMerseyArchyLibraryAccessors = new MerseyArchyLibraryAccessors(owner);
        private final MerseyFirestoreLibraryAccessors laccForMerseyFirestoreLibraryAccessors = new MerseyFirestoreLibraryAccessors(owner);

        public MerseyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for animators (io.github.merseyside:animators)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAnimators() {
                return create("mersey.animators");
        }

            /**
             * Creates a dependency provider for filemanager (io.github.merseyside:filemanager)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getFilemanager() {
                return create("mersey.filemanager");
        }

            /**
             * Creates a dependency provider for materialRangeBar (io.github.merseyside:rangebar)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterialRangeBar() {
                return create("mersey.materialRangeBar");
        }

            /**
             * Creates a dependency provider for oauth (io.github.merseyside:oauth-android)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getOauth() {
                return create("mersey.oauth");
        }

            /**
             * Creates a dependency provider for pagination (io.github.merseyside:pagination-mersey-adapters)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPagination() {
                return create("mersey.pagination");
        }

            /**
             * Creates a dependency provider for quickAction (io.github.merseyside:quickaction)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getQuickAction() {
                return create("mersey.quickAction");
        }

            /**
             * Creates a dependency provider for utils (io.github.merseyside:utils)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getUtils() {
                return create("mersey.utils");
        }

        /**
         * Returns the group of libraries at mersey.adapters
         */
        public MerseyAdaptersLibraryAccessors getAdapters() {
            return laccForMerseyAdaptersLibraryAccessors;
        }

        /**
         * Returns the group of libraries at mersey.archy
         */
        public MerseyArchyLibraryAccessors getArchy() {
            return laccForMerseyArchyLibraryAccessors;
        }

        /**
         * Returns the group of libraries at mersey.firestore
         */
        public MerseyFirestoreLibraryAccessors getFirestore() {
            return laccForMerseyFirestoreLibraryAccessors;
        }

    }

    public static class MerseyAdaptersLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final MerseyAdaptersCoroutineLibraryAccessors laccForMerseyAdaptersCoroutineLibraryAccessors = new MerseyAdaptersCoroutineLibraryAccessors(owner);

        public MerseyAdaptersLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for adapters (io.github.merseyside:adapters)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("mersey.adapters");
        }

            /**
             * Creates a dependency provider for compose (io.github.merseyside:adapters-compose)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("mersey.adapters.compose");
        }

            /**
             * Creates a dependency provider for delegates (io.github.merseyside:adapters-delegates)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDelegates() {
                return create("mersey.adapters.delegates");
        }

        /**
         * Returns the group of libraries at mersey.adapters.coroutine
         */
        public MerseyAdaptersCoroutineLibraryAccessors getCoroutine() {
            return laccForMerseyAdaptersCoroutineLibraryAccessors;
        }

    }

    public static class MerseyAdaptersCoroutineLibraryAccessors extends SubDependencyFactory {

        public MerseyAdaptersCoroutineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for ext (io.github.merseyside:adapters-delegates)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getExt() {
                return create("mersey.adapters.coroutine.ext");
        }

    }

    public static class MerseyArchyLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public MerseyArchyLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for archy (io.github.merseyside:archy)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("mersey.archy");
        }

            /**
             * Creates a dependency provider for kmm (io.github.merseyside:archy-android)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKmm() {
                return create("mersey.archy.kmm");
        }

    }

    public static class MerseyFirestoreLibraryAccessors extends SubDependencyFactory {

        public MerseyFirestoreLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for coroutines (io.github.merseyside:firestore-coroutine-adapter)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCoroutines() {
                return create("mersey.firestore.coroutines");
        }

    }

    public static class MokoLibraryAccessors extends SubDependencyFactory {
        private final MokoMvvmLibraryAccessors laccForMokoMvvmLibraryAccessors = new MokoMvvmLibraryAccessors(owner);
        private final MokoResourcesLibraryAccessors laccForMokoResourcesLibraryAccessors = new MokoResourcesLibraryAccessors(owner);

        public MokoLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

        /**
         * Returns the group of libraries at moko.mvvm
         */
        public MokoMvvmLibraryAccessors getMvvm() {
            return laccForMokoMvvmLibraryAccessors;
        }

        /**
         * Returns the group of libraries at moko.resources
         */
        public MokoResourcesLibraryAccessors getResources() {
            return laccForMokoResourcesLibraryAccessors;
        }

    }

    public static class MokoMvvmLibraryAccessors extends SubDependencyFactory {
        private final MokoMvvmLivedataLibraryAccessors laccForMokoMvvmLivedataLibraryAccessors = new MokoMvvmLivedataLibraryAccessors(owner);

        public MokoMvvmLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for databinding (dev.icerock.moko:mvvm-databinding)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getDatabinding() {
                return create("moko.mvvm.databinding");
        }

            /**
             * Creates a dependency provider for viewbinding (dev.icerock.moko:mvvm-viewbinding)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getViewbinding() {
                return create("moko.mvvm.viewbinding");
        }

        /**
         * Returns the group of libraries at moko.mvvm.livedata
         */
        public MokoMvvmLivedataLibraryAccessors getLivedata() {
            return laccForMokoMvvmLivedataLibraryAccessors;
        }

    }

    public static class MokoMvvmLivedataLibraryAccessors extends SubDependencyFactory {

        public MokoMvvmLivedataLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for material (dev.icerock.moko:mvvm-livedata-material)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getMaterial() {
                return create("moko.mvvm.livedata.material");
        }

    }

    public static class MokoResourcesLibraryAccessors extends SubDependencyFactory {

        public MokoResourcesLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for compose (dev.icerock.moko:resources-compose)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompose() {
                return create("moko.resources.compose");
        }

    }

    public static class RetrofitLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {
        private final RetrofitCoroutineLibraryAccessors laccForRetrofitCoroutineLibraryAccessors = new RetrofitCoroutineLibraryAccessors(owner);
        private final RetrofitLoggingLibraryAccessors laccForRetrofitLoggingLibraryAccessors = new RetrofitLoggingLibraryAccessors(owner);

        public RetrofitLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for retrofit (com.squareup.retrofit2:retrofit)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("retrofit");
        }

            /**
             * Creates a dependency provider for converter (com.squareup.retrofit2:converter-gson)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getConverter() {
                return create("retrofit.converter");
        }

            /**
             * Creates a dependency provider for scalars (com.squareup.retrofit2:converter-scalars)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getScalars() {
                return create("retrofit.scalars");
        }

            /**
             * Creates a dependency provider for serialization (com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getSerialization() {
                return create("retrofit.serialization");
        }

        /**
         * Returns the group of libraries at retrofit.coroutine
         */
        public RetrofitCoroutineLibraryAccessors getCoroutine() {
            return laccForRetrofitCoroutineLibraryAccessors;
        }

        /**
         * Returns the group of libraries at retrofit.logging
         */
        public RetrofitLoggingLibraryAccessors getLogging() {
            return laccForRetrofitLoggingLibraryAccessors;
        }

    }

    public static class RetrofitCoroutineLibraryAccessors extends SubDependencyFactory {

        public RetrofitCoroutineLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for adapter (com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getAdapter() {
                return create("retrofit.coroutine.adapter");
        }

    }

    public static class RetrofitLoggingLibraryAccessors extends SubDependencyFactory {

        public RetrofitLoggingLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for interceptor (com.squareup.okhttp3:logging-interceptor)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getInterceptor() {
                return create("retrofit.logging.interceptor");
        }

    }

    public static class RoomLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public RoomLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for room (androidx.room:room-runtime)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("room");
        }

            /**
             * Creates a dependency provider for compiler (androidx.room:room-compiler)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCompiler() {
                return create("room.compiler");
        }

            /**
             * Creates a dependency provider for ktx (androidx.room:room-ktx)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getKtx() {
                return create("room.ktx");
        }

    }

    public static class SecurityLibraryAccessors extends SubDependencyFactory {

        public SecurityLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for crypto (androidx.security:security-crypto)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getCrypto() {
                return create("security.crypto");
        }

    }

    public static class SqldelightLibraryAccessors extends SubDependencyFactory implements DependencyNotationSupplier {

        public SqldelightLibraryAccessors(AbstractExternalDependencyFactory owner) { super(owner); }

            /**
             * Creates a dependency provider for sqldelight (com.squareup.sqldelight:android-driver)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> asProvider() {
                return create("sqldelight");
        }

            /**
             * Creates a dependency provider for paging (com.squareup.sqldelight:android-paging3-extensions)
             * This dependency was declared in catalog android.versions.toml
             */
            public Provider<MinimalExternalModuleDependency> getPaging() {
                return create("sqldelight.paging");
        }

    }

    public static class VersionAccessors extends VersionFactory  {

        private final AndroidxVersionAccessors vaccForAndroidxVersionAccessors = new AndroidxVersionAccessors(providers, config);
        private final MerseyVersionAccessors vaccForMerseyVersionAccessors = new MerseyVersionAccessors(providers, config);
        private final MokoVersionAccessors vaccForMokoVersionAccessors = new MokoVersionAccessors(providers, config);
        private final SecurityVersionAccessors vaccForSecurityVersionAccessors = new SecurityVersionAccessors(providers, config);
        public VersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: activity (1.7.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getActivity() { return getVersion("activity"); }

            /**
             * Returns the version associated to this alias: appCompat (1.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAppCompat() { return getVersion("appCompat"); }

            /**
             * Returns the version associated to this alias: asyncLayoutInflater (1.1.0-alpha01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAsyncLayoutInflater() { return getVersion("asyncLayoutInflater"); }

            /**
             * Returns the version associated to this alias: auth (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAuth() { return getVersion("auth"); }

            /**
             * Returns the version associated to this alias: billing (4.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getBilling() { return getVersion("billing"); }

            /**
             * Returns the version associated to this alias: bouncyCastle (1.65)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getBouncyCastle() { return getVersion("bouncyCastle"); }

            /**
             * Returns the version associated to this alias: cameraVision (20.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCameraVision() { return getVersion("cameraVision"); }

            /**
             * Returns the version associated to this alias: cardView (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCardView() { return getVersion("cardView"); }

            /**
             * Returns the version associated to this alias: cicerone (7.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCicerone() { return getVersion("cicerone"); }

            /**
             * Returns the version associated to this alias: coil (2.4.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCoil() { return getVersion("coil"); }

            /**
             * Returns the version associated to this alias: constraintLayout (2.2.0-alpha10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getConstraintLayout() { return getVersion("constraintLayout"); }

            /**
             * Returns the version associated to this alias: coroutines (1.7.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCoroutines() { return getVersion("coroutines"); }

            /**
             * Returns the version associated to this alias: dagger (2.46.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getDagger() { return getVersion("dagger"); }

            /**
             * Returns the version associated to this alias: desugarJdk (1.2.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getDesugarJdk() { return getVersion("desugarJdk"); }

            /**
             * Returns the version associated to this alias: emoji (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getEmoji() { return getVersion("emoji"); }

            /**
             * Returns the version associated to this alias: firebaseBom (32.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getFirebaseBom() { return getVersion("firebaseBom"); }

            /**
             * Returns the version associated to this alias: flexBox (3.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getFlexBox() { return getVersion("flexBox"); }

            /**
             * Returns the version associated to this alias: fragment (1.6.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getFragment() { return getVersion("fragment"); }

            /**
             * Returns the version associated to this alias: glance (1.0.0-beta01)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getGlance() { return getVersion("glance"); }

            /**
             * Returns the version associated to this alias: grpc (1.43.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getGrpc() { return getVersion("grpc"); }

            /**
             * Returns the version associated to this alias: gson (2.8.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getGson() { return getVersion("gson"); }

            /**
             * Returns the version associated to this alias: keyboard (3.0.0-RC3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getKeyboard() { return getVersion("keyboard"); }

            /**
             * Returns the version associated to this alias: koin (3.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getKoin() { return getVersion("koin"); }

            /**
             * Returns the version associated to this alias: kotlin (1.9.10)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getKotlin() { return getVersion("kotlin"); }

            /**
             * Returns the version associated to this alias: ktor (2.3.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getKtor() { return getVersion("ktor"); }

            /**
             * Returns the version associated to this alias: lifecycle (2.6.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getLifecycle() { return getVersion("lifecycle"); }

            /**
             * Returns the version associated to this alias: location (19.0.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getLocation() { return getVersion("location"); }

            /**
             * Returns the version associated to this alias: material (1.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getMaterial() { return getVersion("material"); }

            /**
             * Returns the version associated to this alias: navigation (2.7.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getNavigation() { return getVersion("navigation"); }

            /**
             * Returns the version associated to this alias: paging (3.1.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getPaging() { return getVersion("paging"); }

            /**
             * Returns the version associated to this alias: phoneValidator (8.12.54)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getPhoneValidator() { return getVersion("phoneValidator"); }

            /**
             * Returns the version associated to this alias: playCore (1.10.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getPlayCore() { return getVersion("playCore"); }

            /**
             * Returns the version associated to this alias: publisher (v3-rev20230615-2.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getPublisher() { return getVersion("publisher"); }

            /**
             * Returns the version associated to this alias: recyclerView (1.3.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRecyclerView() { return getVersion("recyclerView"); }

            /**
             * Returns the version associated to this alias: retrofit (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRetrofit() { return getVersion("retrofit"); }

            /**
             * Returns the version associated to this alias: retrofitCoroutineAdapter (0.9.2)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRetrofitCoroutineAdapter() { return getVersion("retrofitCoroutineAdapter"); }

            /**
             * Returns the version associated to this alias: retrofitLoggingInterceptor (4.9.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRetrofitLoggingInterceptor() { return getVersion("retrofitLoggingInterceptor"); }

            /**
             * Returns the version associated to this alias: retrofitSerializationConverter (0.8.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRetrofitSerializationConverter() { return getVersion("retrofitSerializationConverter"); }

            /**
             * Returns the version associated to this alias: room (2.4.3)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRoom() { return getVersion("room"); }

            /**
             * Returns the version associated to this alias: rxjava2 (2.2.20)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getRxjava2() { return getVersion("rxjava2"); }

            /**
             * Returns the version associated to this alias: sqldelight (1.5.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getSqldelight() { return getVersion("sqldelight"); }

            /**
             * Returns the version associated to this alias: typedDataStore (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getTypedDataStore() { return getVersion("typedDataStore"); }

            /**
             * Returns the version associated to this alias: worker (2.8.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getWorker() { return getVersion("worker"); }

            /**
             * Returns the version associated to this alias: zip4j (2.9.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getZip4j() { return getVersion("zip4j"); }

        /**
         * Returns the group of versions at versions.androidx
         */
        public AndroidxVersionAccessors getAndroidx() {
            return vaccForAndroidxVersionAccessors;
        }

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

        /**
         * Returns the group of versions at versions.security
         */
        public SecurityVersionAccessors getSecurity() {
            return vaccForSecurityVersionAccessors;
        }

    }

    public static class AndroidxVersionAccessors extends VersionFactory  {

        public AndroidxVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: androidx.core (1.10.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCore() { return getVersion("androidx.core"); }

    }

    public static class MerseyVersionAccessors extends VersionFactory  {

        private final MerseyFirestoreVersionAccessors vaccForMerseyFirestoreVersionAccessors = new MerseyFirestoreVersionAccessors(providers, config);
        private final MerseyPaginationVersionAccessors vaccForMerseyPaginationVersionAccessors = new MerseyPaginationVersionAccessors(providers, config);
        public MerseyVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.adapters (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAdapters() { return getVersion("mersey.adapters"); }

            /**
             * Returns the version associated to this alias: mersey.android (2.0.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAndroid() { return getVersion("mersey.android"); }

            /**
             * Returns the version associated to this alias: mersey.filemanager (1.0.8)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getFilemanager() { return getVersion("mersey.filemanager"); }

            /**
             * Returns the version associated to this alias: mersey.kmm (1.5.4)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getKmm() { return getVersion("mersey.kmm"); }

            /**
             * Returns the version associated to this alias: mersey.materialRangeBar (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getMaterialRangeBar() { return getVersion("mersey.materialRangeBar"); }

            /**
             * Returns the version associated to this alias: mersey.oauth (1.0.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getOauth() { return getVersion("mersey.oauth"); }

            /**
             * Returns the version associated to this alias: mersey.quickAction (2.4.7)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getQuickAction() { return getVersion("mersey.quickAction"); }

        /**
         * Returns the group of versions at versions.mersey.firestore
         */
        public MerseyFirestoreVersionAccessors getFirestore() {
            return vaccForMerseyFirestoreVersionAccessors;
        }

        /**
         * Returns the group of versions at versions.mersey.pagination
         */
        public MerseyPaginationVersionAccessors getPagination() {
            return vaccForMerseyPaginationVersionAccessors;
        }

    }

    public static class MerseyFirestoreVersionAccessors extends VersionFactory  {

        private final MerseyFirestoreCoroutineVersionAccessors vaccForMerseyFirestoreCoroutineVersionAccessors = new MerseyFirestoreCoroutineVersionAccessors(providers, config);
        public MerseyFirestoreVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

        /**
         * Returns the group of versions at versions.mersey.firestore.coroutine
         */
        public MerseyFirestoreCoroutineVersionAccessors getCoroutine() {
            return vaccForMerseyFirestoreCoroutineVersionAccessors;
        }

    }

    public static class MerseyFirestoreCoroutineVersionAccessors extends VersionFactory  {

        public MerseyFirestoreCoroutineVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.firestore.coroutine.adapter (1.0.5)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAdapter() { return getVersion("mersey.firestore.coroutine.adapter"); }

    }

    public static class MerseyPaginationVersionAccessors extends VersionFactory  {

        public MerseyPaginationVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: mersey.pagination.adapters (0.1.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getAdapters() { return getVersion("mersey.pagination.adapters"); }

    }

    public static class MokoVersionAccessors extends VersionFactory  {

        public MokoVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: moko.mvvm (0.15.0)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getMvvm() { return getVersion("moko.mvvm"); }

            /**
             * Returns the version associated to this alias: moko.resources (0.20.1)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getResources() { return getVersion("moko.resources"); }

    }

    public static class SecurityVersionAccessors extends VersionFactory  {

        public SecurityVersionAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

            /**
             * Returns the version associated to this alias: security.crypto (1.1.0-alpha03)
             * If the version is a rich version and that its not expressible as a
             * single version string, then an empty string is returned.
             * This version was declared in catalog android.versions.toml
             */
            public Provider<String> getCrypto() { return getVersion("security.crypto"); }

    }

    public static class BundleAccessors extends BundleFactory {
        private final MerseyBundleAccessors baccForMerseyBundleAccessors = new MerseyBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);
        private final MokoBundleAccessors baccForMokoBundleAccessors = new MokoBundleAccessors(objects, providers, config, attributesFactory, capabilityNotationParser);

        public BundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for coil which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.coil-kt:coil</li>
             *    <li>io.coil-kt:coil-svg</li>
             *    <li>io.coil-kt:coil-gif</li>
             *    <li>io.coil-kt:coil-video</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getCoil() {
                return createBundle("coil");
            }

            /**
             * Creates a dependency bundle provider for emoji which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.emoji2:emoji2</li>
             *    <li>androidx.emoji2:emoji2-views</li>
             *    <li>androidx.emoji2:emoji2-views-helper</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getEmoji() {
                return createBundle("emoji");
            }

            /**
             * Creates a dependency bundle provider for grpc which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.grpc:grpc-okhttp</li>
             *    <li>io.grpc:grpc-core</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getGrpc() {
                return createBundle("grpc");
            }

            /**
             * Creates a dependency bundle provider for koin which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.insert-koin:koin-android</li>
             *    <li>io.insert-koin:koin-androidx-navigation</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKoin() {
                return createBundle("koin");
            }

            /**
             * Creates a dependency bundle provider for ktor which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.ktor:ktor-client-android</li>
             *    <li>io.ktor:ktor-client-okhttp</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getKtor() {
                return createBundle("ktor");
            }

            /**
             * Creates a dependency bundle provider for lifecycle which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-ktx</li>
             *    <li>androidx.lifecycle:lifecycle-viewmodel-savedstate</li>
             *    <li>androidx.lifecycle:lifecycle-livedata-ktx</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getLifecycle() {
                return createBundle("lifecycle");
            }

            /**
             * Creates a dependency bundle provider for navigation which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.navigation:navigation-fragment-ktx</li>
             *    <li>androidx.navigation:navigation-ui-ktx</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getNavigation() {
                return createBundle("navigation");
            }

            /**
             * Creates a dependency bundle provider for retrofit which is an aggregate for the following dependencies:
             * <ul>
             *    <li>com.squareup.retrofit2:retrofit</li>
             *    <li>com.squareup.retrofit2:converter-gson</li>
             *    <li>com.squareup.retrofit2:converter-scalars</li>
             *    <li>com.jakewharton.retrofit:retrofit2-kotlinx-serialization-converter</li>
             *    <li>com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter</li>
             *    <li>com.squareup.okhttp3:logging-interceptor</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRetrofit() {
                return createBundle("retrofit");
            }

            /**
             * Creates a dependency bundle provider for room which is an aggregate for the following dependencies:
             * <ul>
             *    <li>androidx.room:room-runtime</li>
             *    <li>androidx.room:room-ktx</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getRoom() {
                return createBundle("room");
            }

        /**
         * Returns the group of bundles at bundles.mersey
         */
        public MerseyBundleAccessors getMersey() {
            return baccForMerseyBundleAccessors;
        }

        /**
         * Returns the group of bundles at bundles.moko
         */
        public MokoBundleAccessors getMoko() {
            return baccForMokoBundleAccessors;
        }

    }

    public static class MerseyBundleAccessors extends BundleFactory {

        public MerseyBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for mersey.adapters which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.github.merseyside:adapters</li>
             *    <li>io.github.merseyside:adapters-delegates</li>
             *    <li>io.github.merseyside:adapters-compose</li>
             *    <li>io.github.merseyside:adapters-delegates</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAdapters() {
                return createBundle("mersey.adapters");
            }

            /**
             * Creates a dependency bundle provider for mersey.android which is an aggregate for the following dependencies:
             * <ul>
             *    <li>io.github.merseyside:archy</li>
             *    <li>io.github.merseyside:animators</li>
             *    <li>io.github.merseyside:utils</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getAndroid() {
                return createBundle("mersey.android");
            }

    }

    public static class MokoBundleAccessors extends BundleFactory {

        public MokoBundleAccessors(ObjectFactory objects, ProviderFactory providers, DefaultVersionCatalog config, ImmutableAttributesFactory attributesFactory, CapabilityNotationParser capabilityNotationParser) { super(objects, providers, config, attributesFactory, capabilityNotationParser); }

            /**
             * Creates a dependency bundle provider for moko.mvvm which is an aggregate for the following dependencies:
             * <ul>
             *    <li>dev.icerock.moko:mvvm-databinding</li>
             *    <li>dev.icerock.moko:mvvm-viewbinding</li>
             *    <li>dev.icerock.moko:mvvm-livedata-material</li>
             * </ul>
             * This bundle was declared in catalog android.versions.toml
             */
            public Provider<ExternalModuleDependencyBundle> getMvvm() {
                return createBundle("moko.mvvm");
            }

    }

    public static class PluginAccessors extends PluginFactory {

        public PluginAccessors(ProviderFactory providers, DefaultVersionCatalog config) { super(providers, config); }

    }

}
