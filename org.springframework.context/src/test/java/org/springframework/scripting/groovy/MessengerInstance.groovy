package org.springframework.scripting.groovy;

import org.springframework.scripting.Messenger

class GroovyMessenger2 implements Messenger {

    GroovyMessenger2() {
        println "GroovyMessenger"
    }

    def String message;
}

return new GroovyMessenger2();
