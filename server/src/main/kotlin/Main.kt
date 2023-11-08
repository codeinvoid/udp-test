import java.net.DatagramPacket
import java.net.DatagramSocket

fun main(args: Array<String>) {
    val port = 5023
    startServer(port)
}

private fun startServer(port: Int) {
    DatagramSocket(port).use { socket ->
        val buffer = ByteArray(1024)
        while (true) {
            val packet = DatagramPacket(buffer, buffer.size)
            socket.receive(packet)
            val text = String(buffer, 0, 5)

            println(text)
        }
    }
}

