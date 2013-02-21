blank
=====

Blank Scala project for quick&amp;easy setup. Just clone it and you are ready to go!

## Quick Start

```bash
> mkdir my-project
> cd my-project
> git clone git@github.com:czechscala/blank.git .
> sbt
```

```sbt
sbt> run
```

## Features
* [Scala](http://www.scala-lang.org) 2.10
* [ScalaTest](http://www.scalatest.org) 1.9.1
* .gitignore with the most common settings
* SBT plugins
  * [gen-idea](https://github.com/mpeltonen/sbt-idea)
  * [eclipse](https://github.com/typesafehub/sbteclipse)

## Prerequisities
* [SBT](http://www.scala-sbt.org) 0.12

## Documentation

### Installing SBT
* [Mac OS X](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#mac)
  * Homebrew is recommended
* [Windows](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#installing-sbt)
* [Linux - Gentoo](http://www.scala-sbt.org/release/docs/Getting-Started/Setup.html#gentoo)

### IntelliJ IDEA
This Blank project contains SBT plugin **gen-idea** that allows you to generate IDEA's project files.

We suggest you **change the name of the project** in the `build.sbt` file after you clone the repository. 
Start SBT and run following command:

```
> sbt
sbt> gen-idea no-sbt-build-module
```

Then you can open the project using IDEA as you are used to. The most important things should already be setup.

### Eclipse
You will need the [Scala IDE](http://scala-ide.org/) plugin to work with Scala projects in your Eclipse.
We recommend the latest [milestone release](http://scala-ide.org/download/milestone.html) of Scala IDE 2.1.0.

This Blank project contains SBT plugin [sbteclipse](https://github.com/typesafehub/sbteclipse/wiki/Using-sbteclipse)
that allows you to generate Eclipse project definitions.

We suggest you **change the name of the project** in the `build.sbt` file after you clone the repository (otherwise the name of the project would be `blank`).

After that, start SBT and run the following command:

```
> sbt
sbt> eclipse
```

This will create an Eclipse project that you can import into your workspace.

### REPL
SBT contains a nice command `console` which allows firing up a REPL (Scala console) with the **project on classpath**.
That means that you can interactively try your code.

```
> sbt
sbt> console
scala> import com.czechscala.blank._
scala> Hello.sayHello
```
