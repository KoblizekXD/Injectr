package lol.koblizek.injectr.gradle.tasks;

import org.gradle.api.DefaultTask;
import org.gradle.api.file.RegularFileProperty;
import org.gradle.api.tasks.InputFile;
import org.gradle.api.tasks.TaskAction;

public abstract class PostJarTask extends DefaultTask {
    public PostJarTask() {
        setGroup("injectr");
        setDescription("Post-processes the jar file to inject and modify the bytecode");
    }

    @InputFile public abstract RegularFileProperty getJarFile();

    @TaskAction
    public void process() {
        System.out.println("Processing jar file: " + getJarFile().get().getAsFile().getName());
    }
}
