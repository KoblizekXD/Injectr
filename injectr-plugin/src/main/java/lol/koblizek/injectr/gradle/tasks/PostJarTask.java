package lol.koblizek.injectr.gradle.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.tasks.Input;
import org.gradle.api.tasks.TaskAction;

import java.io.File;

public class PostJarTask extends DefaultTask {
    public PostJarTask() {
        setGroup("injectr");
        setDescription("Post-processes the jar file to inject and modify the bytecode");
    }

    @Input
    public File jarFile;

    @TaskAction
    public void process() {

    }
}
