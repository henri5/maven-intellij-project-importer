# maven-intellij-project-importer

The plugin enables using Maven projects as IntelliJ plugin project. 
## Without the plugin:
Plugin projects are normal Java projects, have type JAVA_MODULE in .iml. If one manually edits the type to be PLUGIN_MODULE, on 
next Maven refresh the change is reverted.
## With the plugin:
One has to add Maven property to declare the module to be marked as PLUGIN_MODULE.
```
<properties>
  <henri5.importer.type>PLUGIN_MODULE</henri5.importer.type>
</properties>
```
After that, just do Maven refresh. 
It's not smart though - don't try adding ANDROID_MODULE or something else there. For there needs to be different custom importer. 
Make a pull request or whatever.

Download the zip from - https://github.com/henri5/maven-intellij-project-importer/releases

## TODO
1. Test
2. Build script. 

## Development
1. import as plugin project
2. from $IJ_INSTALL_DIR/plugins add devkit/lib/devkit.jar, maven/lib/maven.jar and maven/lib/maven-server-api.jar to project dependencies

### Special thanks
Alexander D. at JetBrains https://youtrack.jetbrains.com/issue/IDEA-65130
