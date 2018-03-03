package henri5.importer;

import com.intellij.openapi.externalSystem.service.project.IdeModifiableModelsProvider;
import com.intellij.openapi.module.Module;
import com.intellij.openapi.module.ModuleType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.idea.devkit.module.PluginModuleType;
import org.jetbrains.idea.maven.importing.MavenImporter;
import org.jetbrains.idea.maven.importing.MavenRootModelAdapter;
import org.jetbrains.idea.maven.project.MavenProject;
import org.jetbrains.idea.maven.project.MavenProjectChanges;
import org.jetbrains.idea.maven.project.MavenProjectsProcessorTask;
import org.jetbrains.idea.maven.project.MavenProjectsTree;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class PluginMavenImporter extends MavenImporter {

  public PluginMavenImporter() {
    super("henri5.importer.group", "henri5.importer.artifact");
  }

  @NotNull
  @Override
  public ModuleType getModuleType() {
    return PluginModuleType.getInstance();
  }

  @Override
  public boolean isApplicable(MavenProject project) {
    return "PLUGIN_MODULE".equals(project.getProperties().getProperty("henri5.importer.type"));
  }

  @Override
  public void getSupportedPackagings(Collection<String> result) {
    result.add("jar");
  }

  @Override
  public void preProcess(Module m, MavenProject p, MavenProjectChanges c, IdeModifiableModelsProvider pr) {
  }

  @Override
  public void process(
      IdeModifiableModelsProvider pr, Module m, MavenRootModelAdapter a,
      MavenProjectsTree t, MavenProject p, MavenProjectChanges c, Map<MavenProject, String> map,
      List<MavenProjectsProcessorTask> list) {
  }
}
