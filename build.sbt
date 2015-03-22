name := "bayesian-statistics-with-scala-examples"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies  ++= Seq(
  "org.scalanlp" %% "breeze-parent" % "0.12-SNAPSHOT"
)

resolvers ++= Seq(
  // other resolvers here
  // if you want to use snapshot builds (currently 0.11-SNAPSHOT), use this.
  "Sonatype Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots/",
  "Sonatype Releases" at "https://oss.sonatype.org/content/repositories/releases/"
)
