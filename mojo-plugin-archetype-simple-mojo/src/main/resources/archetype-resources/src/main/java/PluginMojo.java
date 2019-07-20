#set( $symbol_pound = '#' )
#set( $symbol_dollar = '$' )
#set( $symbol_escape = '\' )
package ${package};

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.LifecyclePhase;
import org.apache.maven.plugins.annotations.Mojo;
import org.apache.maven.plugins.annotations.Parameter;

@Mojo(name = "run", defaultPhase = LifecyclePhase.GENERATE_SOURCES)
public class PluginMojo extends AbstractMojo {
    @Parameter(property = "message", defaultValue = "This is a message", required = true)
    private String message;

    public void execute() throws MojoExecutionException, MojoFailureException {
        getLog().info(message);
    }
}