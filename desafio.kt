// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String, val email: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>, val nivel: Nivel) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    val novaFormacao: Formacao = Formacao("kotlin", listOf(ConteudoEducacional("Aprendendo fundamentos kotlin"), ConteudoEducacional("Aprendendo fundamentos Android")), Nivel.BASICO)
    novaFormacao.matricular(Usuario("aluno", "aluno@aluno.com"))
    println(novaFormacao.nome)
	println(novaFormacao.conteudos)
    println(novaFormacao.nivel)
    println(novaFormacao.inscritos)
}
