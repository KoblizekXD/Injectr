package lol.koblizek.injectr.gradle;

import lol.koblizek.injectr.gradle.tasks.PostJarTask;
import org.gradle.api.Plugin;
import org.gradle.api.Project;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class InjectrPlugin implements Plugin<Project> {
    @Override
    public void apply(@NotNull Project project) {
        project.getTasks().create("postJar", PostJarTask.class, task -> {
            task.jarFile = project.getTasks().getByName("jar").getOutputs().getFiles().getSingleFile();
        });
        project.getTasks().getByName("jar").setFinalizedBy(Collections.singleton("postJar"));
    }
}
