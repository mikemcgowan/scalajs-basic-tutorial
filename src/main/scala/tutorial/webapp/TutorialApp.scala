package tutorial.webapp

import org.querki.jquery._

object TutorialApp {
  def main(args: Array[String]): Unit = {
    $(() => setupUI())
  }

  def setupUI(): Unit = {
    $("body") append "<p>Hello World</p>"
    $("""<button type="button">Click me!</button>""")
      .click(() => addClickedMessage())
      .appendTo($("body"))
  }

  def addClickedMessage(): Unit = {
    $("body") append "<p>You clicked the button!</p>"
  }
}
