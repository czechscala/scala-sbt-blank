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
The Blank project contains SBT plugin **gen-idea**  which allows to generate IDEA's project files.

I suggest you change the name of the project in the `build.sbt` file after you clone the repository. 
Start SBT and run following command:

```
> sbt
sbt> gen-idea no-sbt-build-module
```

Then you can open the project using IDEA as you are used to. The most important things should already be setup.
