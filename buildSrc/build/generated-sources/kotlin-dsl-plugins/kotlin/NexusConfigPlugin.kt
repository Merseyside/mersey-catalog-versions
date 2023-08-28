/**
 * Precompiled [nexus-config.gradle.kts][Nexus_config_gradle] script plugin.
 *
 * @see Nexus_config_gradle
 */
public
class NexusConfigPlugin : org.gradle.api.Plugin<org.gradle.api.Project> {
    override fun apply(target: org.gradle.api.Project) {
        try {
            Class
                .forName("Nexus_config_gradle")
                .getDeclaredConstructor(org.gradle.api.Project::class.java, org.gradle.api.Project::class.java)
                .newInstance(target, target)
        } catch (e: java.lang.reflect.InvocationTargetException) {
            throw e.targetException
        }
    }
}
