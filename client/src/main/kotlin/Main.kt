import java.net.DatagramPacket
import java.net.DatagramSocket
import java.net.InetAddress

fun main(args: Array<String>) {
    val port = 5023
    startClient(port)
}

private fun startClient(port: Int) {
    DatagramSocket().use { socket ->
        val address = InetAddress.getByName("localhost")
        val packet = DatagramPacket("Hello".toByteArray(), 5, address, port)
        socket.send(packet)
    }
}

