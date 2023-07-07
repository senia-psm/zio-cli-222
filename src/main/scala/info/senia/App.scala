package info.senia

import zio.*
import zio.cli.*

import java.time.Instant
import java.util.UUID


object App extends ZIOCliDefault {

  private val param = Options.text("param")

  override def cliApp: CliApp[Any with ZIOAppArgs with Scope, Any, Any] =
    CliApp.make(
      "test",
      "0.1.0",
      HelpDoc.Span.text("Reproduce --help issue"),
      command = Command("test", param).subcommands(
        Command("a")
          .subcommands(
            Command("b")
          )
          .map { _ => () }
      )
    ) { _ => ZIO.unit    }
}


