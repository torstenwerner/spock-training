package com.westernacher.training

import spock.lang.Specification

class InteractionTest extends Specification {
    def "run task in a thread"() {
        setup:
        def task = Mock(Runnable)
        def thread = new Thread(task)

        when:
        thread.start()
        thread.join()

        then:
        1 * task.run()
    }
}
