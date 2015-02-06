import sbt._
import com.typesafe.sbt.osgi.SbtOsgi

object Build extends sbt.Build {
  lazy val fooProject = Project("foo-project", file("."))
    .enablePlugins(SbtOsgi)
}
