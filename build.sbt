name := "Lenses"

version := "0.1"

scalaVersion := "2.13.3"
val scalazVersion = "7.1.0"
val monocleVersion = "2.0.4"

libraryDependencies ++= Seq(
  "com.github.julien-truffaut" %% "monocle-core"     % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-generic"  % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-macro"    % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-law"      % monocleVersion            % "test",
)