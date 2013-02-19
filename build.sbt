name := "blank"

version := "1.0-SNAPSHOT"

scalaVersion := "2.10.0"
 
resolvers += "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq (
	"org.scalatest" % "scalatest_2.10" % "1.9.1" % "test"
)
