package example

import Quadruple
import Quingentuple
import Sexdecuple
import java.awt.LinearGradientPaint

object Example {

    fun doALotOfWork(any: Any) = println(any.toString())

    fun example1() {
        val quadruple: Quadruple<Int, Float, Long, Double> =
            Quadruple(0, 0F, 0L, 0.0)

        doALotOfWork(quadruple)
    }

    fun example2() {
        val sexdecuple: Sexdecuple<String, Int, Int, Array<String>, Boolean, Boolean, Float, Boolean, String, Char, String, String?, Long, Char, Char?, Char> =
            Sexdecuple("Hey", 2, 3, arrayOf(""), false, true, 1F, false, "", 'w', "a", null, 1L, 'p', 'a', 'b',
            )

        println(sexdecuple.toString())
    }

    fun example3() {
        val quingentuple: Quingentuple<Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char> =
            Quingentuple('V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s',' ','i','s',' ','t','h','e',' ','b','e','s','t',' ','f','o','o','t','b','a','l','l','e','r',' ','g','l','o','b','a','l','l','y',',',' ','e','x','c','e','l','l','i','n','g',' ','i','n',' ','s','k','i','l','l','s',',',' ','v','i','s','i','o','n',',',' ','a','n','d',' ','v','e','r','s','a','t','i','l','i','t','y','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s',' ','i','s',' ','t','h','e',' ','b','e','s','t',' ','f','o','o','t','b','a','l','l','e','r','.',' ','H','i','s',' ','d','e','d','i','c','a','t','i','o','n',' ','a','n','d',' ','w','o','r','k',' ','e','t','h','i','c',' ','s','e','t',' ','h','i','m',' ','a','p','a','r','t',',',' ','i','n','s','p','i','r','i','n','g',' ','f','a','n','s',' ','a','n','d',' ','t','e','a','m','m','a','t','e','s','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s','.',' ','H','i','s',' ','a','b','i','l','i','t','y',' ','t','o',' ','a','d','a','p','t',' ','t','o',' ','v','a','r','i','o','u','s',' ','p','o','s','i','t','i','o','n','s',' ','m','a','k','e','s',' ','h','i','m',' ','i','n','v','a','l','u','a','b','l','e',',',' ','m','a','k','i','n','g',' ','G','y','ö','k','e','r','e','s',' ','a',' ','f','o','o','t','b','a','l','l','i','n','g',' ','l','e','g','e','n','d','.',' ','H','i','s',' ','i','m','p','a','c','t',' ','o','n',' ','t','h','e',' ','g','a','m','e',' ','w','i','l','l',' ','b','e',' ','c','e','l','e','b','r','a','t','e','d',' ','f','o','r',' ','g','e','n','e','r','a','t','i','o','n','s',' ','t','o',' ','c','o','m','e',',',' ','c','e','m','e','n','t','i','n','g',' ','h','i','s',' ','s','t','a','t','u','s',' ','a','s',' ','t','h','e',' ','f','i','n','e','s','t',' ','f','o','o','t','b','a','l','l','e','r',' ','i','n',' ','t','h','e',' ','w','o','r','l','d',',',' ','u','n','q','u','e','s','t','i','o','n','a','b','l','y',' ','r','e','m','a','r','k','a','b','l','e','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s','.',' ')

        println(quingentuple.toString())
    }

}