name := "Lenses"

version := "0.1"

scalaVersion := "2.11.2"
val scalazVersion = "7.1.0"
val monocleVersion = "0.5.0"

libraryDependencies ++= Seq(
  "org.scalaz"        %% "scalaz-core"               % scalazVersion,
  "org.scalaz"        %% "scalaz-concurrent"         % scalazVersion,
  "com.github.julien-truffaut" %% "monocle-core"     % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-generic"  % monocleVersion,
  "com.github.julien-truffaut" %% "monocle-macro"    % monocleVersion,
  "org.scalaz"        %% "scalaz-scalacheck-binding" % scalazVersion             % "test",
  "com.github.julien-truffaut" %% "monocle-law"      % monocleVersion            % "test",
)