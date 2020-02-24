package org.jitsi.nlj

import org.jitsi.config.newConfigAttributes
import org.jitsi.utils.config.SimpleProperty

class RtpReceiverConfig {
    class Config {
        companion object {

            class RtpReceiverQueueSizeProperty : SimpleProperty<Int>(
                    newConfigAttributes {
                        readOnce()
                        name("jmt.transceiver.recv.q-size")
                    }
            )
            private val rtpReceiverQueueSizeProperty =
                    RtpReceiverQueueSizeProperty()

            @JvmStatic
            fun rtpReceiverQueueSizeProperty(): Int = rtpReceiverQueueSizeProperty.value
        }
    }
}