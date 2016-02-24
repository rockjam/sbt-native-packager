name := "test-project-simple"
version := "0.2.0"
libraryDependencies ++= Seq(
    "com.typesafe" % "config" % "1.2.1"
)

mainClass in Compile := Some("ExampleApp")

enablePlugins(JavaLibPackaging, JDebPackaging)
javaLibraryPath in Debian := Some(s"/usr/lib/${packageName.value}")

maintainer := "Josh Suereth <joshua.suereth@typesafe.com>"
packageSummary := "Minimal Native Packager"
packageDescription := """A fun package description of our software,
  with multiple lines."""

// RPM SETTINGS
rpmVendor := "typesafe"
rpmLicense := Some("BSD")
rpmChangelogFile := Some("changelog.txt")

//bashScriptConfigLocation := Some("${app_home}/../conf/jvmopts")
