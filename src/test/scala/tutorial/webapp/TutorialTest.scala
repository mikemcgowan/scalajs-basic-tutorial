package tutorial.webapp

import utest._

import org.querki.jquery._

object TutorialTest extends TestSuite {

  TutorialApp.setupUI()

  def tests = Tests {
    'Messages - {
      assert($("p:contains('Message')").length == TutorialApp.messages.size)
    }

    'ButtonClick - {
      def messageCount =
        $("p:contains('You clicked the button!')").length

      val button = $("button:contains('Click me!')")
      assert(button.length == 1)
      assert(messageCount == 0)

      for (c <- 1 to 5) {
        button.click()
        assert(messageCount == c)
      }
    }
  }

}
