name := "$name;format="normalize"$-server"

scalaVersion := "$scalaVersion$"

version := "0.0.1-SNAPSHOT"

resolvers += "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"

mainClass := Some("$org$.$name;format="Camel"$Server")

libraryDependencies ++= Seq(
	"com.twitter" %% "util-collection" % "6.3.6",
	"org.specs2" %% "specs2" % "2.1.1" % "test",
  	"org.slf4j" % "slf4j-simple" % "1.7.5"
)
