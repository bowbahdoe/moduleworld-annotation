import dev.mccue.moduleworld.annotation.*;

@Developer(
        name = "Ethan McCue",
        email = "ethan@mccue.dev",
        organization = "McCue Software Solutions",
        organizationUrl = "https://mccue.dev"
)
@Release(9)
@License("MIT OR Apache-2.0")
@Repository("https://github.com/bowbahdoe/moduleworld-annotation")
@HomePage("https://github.com/bowbahdoe/moduleworld-annotation")
@Name("Module World Annotations")
@Description("Annotations which drive the behavior of the module world set of tools.")
@Version("0.0.1")
@Maven(group = "dev.mccue", artifact = "moduleworld-annotation")
module dev.mccue.moduleworld.annotation {
    requires static java.compiler;

    exports dev.mccue.moduleworld.annotation;
}