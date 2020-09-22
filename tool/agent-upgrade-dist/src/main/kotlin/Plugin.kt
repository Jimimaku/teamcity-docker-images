import java.io.File

class Plugin(val name: String, val path: File, val metadata: PluginMetadata, private val _files: Sequence<File>) {
    fun copy() =
        // Materialize files to copy plugin
        _files.toList()
}