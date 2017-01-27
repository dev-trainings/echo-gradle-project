package com.example

import spock.lang.Specification

import java.util.concurrent.TimeUnit

class SmokeTest extends Specification {

    def 'long running test'() {
        when:
            TimeUnit.SECONDS.sleep(7)
        then:
            noExceptionThrown()
    }
}
