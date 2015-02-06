Cloning the repo and executing sbt in its root results in the following error message:

```
% sbt
[info] Loading project definition from /tmp/sbt-autoplugin-test/project
[info] Updating {file:/tmp/sbt-autoplugin-test/project/}sbt-autoplugin-test-build...
[info] Resolving org.fusesource.jansi#jansi;1.4 ...
[info] Done updating.
[info] Compiling 1 Scala source to /tmp/sbt-autoplugin-test/project/target/scala-2.10/sbt-0.13/classes...
[error] /tmp/sbt-autoplugin-test/project/Build.scala:6: type mismatch;
[error]  found   : com.typesafe.sbt.osgi.SbtOsgi.type
[error]  required: sbt.Plugins
[error]     .enablePlugins(SbtOsgi)
[error]                    ^
[error] one error found
[error] (compile:compile) Compilation failed
Project loading failed: (r)etry, (q)uit, (l)ast, or (i)gnore? q
```
