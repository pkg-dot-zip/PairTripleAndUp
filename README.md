<p align="center">
  <a href="https://github.com/pkg-dot-zip/PairTripleAndUp" rel="noopener">
 <img width=200px height=200px src="https://raw.githubusercontent.com/pkg-dot-zip/PairTripleAndUp/master/projectLogo.png" alt="Project logo"></a>
</p>

<h3 align="center">PairTripleAndUp</h3>

<div align="center">

  [![Stars](https://img.shields.io/github/stars/pkg-dot-zip/PairTripleAndUp.svg)](https://github.com/pkg-dot-zip/PairTripleAndUp/stargazers)
  [![GitHub Issues](https://img.shields.io/github/issues/pkg-dot-zip/PairTripleAndUp.svg)](https://github.com/pkg-dot-zip/PairTripleAndUp/issues)
  [![GitHub Pull Requests](https://img.shields.io/github/issues-pr/pkg-dot-zip/PairTripleAndUp.svg)](https://github.com/pkg-dot-zip/PairTripleAndUp/pulls)
  [![License](https://img.shields.io/badge/license-MIT-blue.svg)](/LICENSE)

</div>

---
<p align="center">Why would Kotlins Tuples stop at <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-pair/">Pair</a> & <a href="https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-triple/">Triple</a>?! Just continue to the thousands...
</p>
<p align="center">A joke just so I can be on <a href="https://www.reddit.com/r/programminghorror/">ProgrammingHorror</a>.
    <br> 
</p>

## 📝 Table of Contents
- [About](#about)
- [TODO](#todo)
- [Usage](#usage)
- [Example]()
- [Built Using](#built_using)
- [Authors](#authors)

## 🧐 About <a name = "about"></a>
### What is it?
This repo contains all kinds of Tuples (click [here](#included-tuples) to see which one are default) **You can generate EVEN MORE by changing the values in *Config.kt!***

If you find this funny (or if you're insane and planning on actually using this) make sure to [star](https://github.com/pkg-dot-zip/PairTripleAndUp/stargazers) the repository. ⭐

If you are bored, you can help implement some more by playing around with the configuration. Feel free to [submit a PR](https://github.com/pkg-dot-zip/PairTripleAndUp/pulls). 💪🏻

If you see any other issues please feel free to [submit a PR](https://github.com/pkg-dot-zip/PairTripleAndUp/pulls), if you are okay with this project being in your history.

### Why?! 😱
#### The reason
I could make up a great story about how I had a dream, or even better how I actually needed it (and thus having a reason to justify creating this monstrosity).

However, truth be told, I thought it would be **funny**. I saw a video about the [/r/ProgrammingHorror](https://www.reddit.com/r/programminghorror/) subreddit and I just needed to create something that would be worth putting on there.

### Did you get the attention you wanted?
Then, after I had finished creating this project, I read the subreddit rules and saw that generated code was not allowed. After recovering from the heartbreaking realization that I wasted my morning, I moved on with life.

However, technically, using a *quadragintuple* or a *septingentuple* wouldn't be generated code (although obviously the dataclass itself is generated).

So who knows, I might get there. 🤷🏻‍♂️

### Do you feel any remorse?
No, I have actually been sleeping much better lately. 😴

#### But what if any future employers see this repository?
They should know I had the **balls** to do this. 🗣️🗣️
They want a hard-working employee right?! Nothing is stopping me baby 🕺🏻🪩✨

### Included Tuples <a name = "tuples"></a>
This repo contains implementations of tuples with the following values:
| Number | HorrorSimple | HorrorFull |
| ------ | ------------ | ---------- |
| 1-20   | ✔️          |  ✔️        |
| 30   | ✔️          |  ✔️        |
| 40   | ✔️          |  ✔️        |
| 50   | ✔️          |  ✔️        |
| 60   | ✔️          |  ✔️        |
| 70   | ✔️          |  ✔️        |
| 80   | ✔️          |  ✔️        |
| 90   | ✔️          |  ✔️        |
| 100   | ✔️          |  ✔️        |
| 200   | ✔️          |  ✔️        |
| 300   | ✔️          |  ✔️        |
| 400   | ✔️          |  ✔️        |
| 500   | ✔️          |  ✔️        |
| 600   | ✔️          |  ✔️        |
| 700   | ✔️          |  ✔️        |
| 800   | ❌          |  ✔️        |
| 900   | ❌          |  ❌        |
| 1000   | ❌          |  ❌        |

## 🛠️ TODO <a name = "todo"></a>
- Technically we could probably use maps, arrays or whatever to store some more data & we would have to use less parameters, but I am not putting more time into this. I have actual projects to maintain.
- You could also play around with the configuration of the JVM to avoid getting an [OutOfMemoryError](https://docs.oracle.com/javase/8/docs/api/java/lang/OutOfMemoryError.html) as quickly.

If you see any other issues please feel free to [submit a PR](https://github.com/pkg-dot-zip/PairTripleAndUp/pulls), if you are okay with this project being in your history.

## 🎈 Usage <a name="usage"></a>
Why would you w..?! 🤨 You know what, okay.

### Plug-and-play
1. Download either:
  - *HorrorSimple.kt* <sub><sup>(no documentation, no *.toString()* & *.toList()*)</sub></sup>
  - *HorrorFull.kt* <sub><sup>(documentation, *.toString()* & *.toList() but less tuples)</sub></sup>
1. Drag them into your Kotlin project.
1. Enjoy long compile times. ⏳
1. Pray you don't get an [OutOfMemoryError](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-out-of-memory-error/). 🙏🏻

### Generating yourself
To generate a proper *.kt* file:
1. Open the project in [IntelliJ](https://www.jetbrains.com/idea/).
1. Go to *Config.kt* and change the values to whatever it is you prefer.
1. Change some code around if you need or want to.
1. Feel  ashamed. 😳

To use the generated file:
1. Drag the generated *.kt* file from the folder you set into a valid *src* folder.
1. Code, and stay, away! 🏃🏻

## Example
Example usage of a quadruple (4). Unfortunately, a quadruple is not enough to also store a [Byte](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-byte/) and [Short](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-short/) <sub><sup>~~(since everyone forgets the [unsigned types in Kotlin](https://kotlinlang.org/docs/unsigned-integer-types.html))~~</sub></sup>.
You can see this will never be enough for real programmers.
```kotlin
fun example1() {
        val quadruple: Quadruple<Int, Float, Long, Double> =
            Quadruple(0, 0F, 0L, 0.0)
        
        doALotOfWork(quadruple)
    }
```

Example usage of a sexdecuple (16).
This should be very understandable by beginners, but might not contain enough values for you.
```kotlin
fun example2() {
        val sexdecuple: Sexdecuple<String, Int, Int, Array<String>, Boolean, Boolean, Float, Boolean, String, Char, String, String?, Long, Char, Char?, Char> =
            Sexdecuple("Hey", 2, 3, arrayOf(""), false, true, 1F, false, "", 'w', "a", null, 1L, 'p', 'a', 'b',
            )

        println(sexdecuple.toString())
    }
```

Example usage of a quingentuple (500). Might be useful if you have a small amount of data you need to store real quick.
```kotlin
fun example3() {
        val quingentuple: Quingentuple<Char, Char, Char, Char, Char, Char, Long, Char, Char, Char, Char, Char, Char, Char, Char, Int, Char, Char, Double, Char, Char, Char, Double, Char, Char, Char, Char, String, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char, Any, Char, Char, Char?, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char?, Char?, Any, Char, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char?, Char, Char, Char, Any?, Char, Char, Char, Any, Char, Char?, Char?, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char?, Char, Char, Char?, Char, Char, Any, Char, Char, Char, Char?, Char?, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char?, Char, Char, Char, Char?, Char, Char, Any, Any, Any, Char, Char?, Char, Char, Char?, Char, Char, Char, Any?, Char, Char, Char, Char, Char, Char?, Any?, Char, Char, Char, Char, Char, Any, Char?, Char, Char, Any?, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char?, Char, Char?, Char, Any, Char, Char, Any?, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char?, Char, Char?, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char?, Char?, Char?, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Any, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char?, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char, Char?> =
            Quingentuple('V','i','k','t','o','r',809L,'G','y','ö','k','e','r','e','s',2987,'i','s',4.2,'t','h','e',4.1,'b','e','s','t',"Kotlin",'f','o','o','t','b','a','l','l','e','r',' ','g','l','o','b','a','l','l','y',',',' ','e','x','c','e','l','l','i','n','g',' ','i','n',' ','s','k','i','l','l','s',',',' ','v','i','s','i','o','n',',',' ','a','n','d',' ','v','e','r','s','a','t','i','l','i','t','y','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s',' ','i','s',' ','t','h','e',' ','b','e','s','t',' ','f','o','o','t','b','a','l','l','e','r','.',' ','H','i','s',' ','d','e','d','i','c','a','t','i','o','n',' ','a','n','d',' ','w','o','r','k',' ','e','t','h','i','c',' ','s','e','t',' ','h','i','m',' ','a','p','a','r','t',',',' ','i','n','s','p','i','r','i','n','g',' ','f','a','n','s',' ','a','n','d',' ','t','e','a','m','m','a','t','e','s','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s','.',' ','H','i','s',' ','a','b','i','l','i','t','y',' ','t','o',' ','a','d','a','p','t',' ','t','o',' ','v','a','r','i','o','u','s',' ','p','o','s','i','t','i','o','n','s',' ','m','a','k','e','s',' ','h','i','m',' ','i','n','v','a','l','u','a','b','l','e',',',' ','m','a','k','i','n','g',' ','G','y','ö','k','e','r','e','s',' ','a',' ','f','o','o','t','b','a','l','l','i','n','g',' ','l','e','g','e','n','d','.',' ','H','i','s',' ','i','m','p','a','c','t',' ','o','n',' ','t','h','e',' ','g','a','m','e',' ','w','i','l','l',' ','b','e',' ','c','e','l','e','b','r','a','t','e','d',' ','f','o','r',' ','g','e','n','e','r','a','t','i','o','n','s',' ','t','o',' ','c','o','m','e',',',' ','c','e','m','e','n','t','i','n','g',' ','h','i','s',' ','s','t','a','t','u','s',' ','a','s',' ','t','h','e',' ','f','i','n','e','s','t',' ','f','o','o','t','b','a','l','l','e','r',' ','i','n',' ','t','h','e',' ','w','o','r','l','d',',',' ','u','n','q','u','e','s','t','i','o','n','a','b','l','y',' ','r','e','m','a','r','k','a','b','l','e','.',' ','V','i','k','t','o','r',' ','G','y','ö','k','e','r','e','s','.',null)

        println(quingentuple.toString())
    }
```

## ⛏️ Built Using <a name = "built_using"></a>
- [Kotlin](https://kotlinlang.org/) - Language used to program in
- [IntelliJ](https://www.jetbrains.com/idea/) - IDE used

## ✍️ Authors <a name = "authors"></a>
- [@OnsPetruske](https://github.com/pkg-dot-zip) - Idea & Initial work. ~~Not proud of this one.~~

See also the list of [contributors](https://github.com/pkg-dot-zip/PairTripleAndUp/contributors) who participated in this project with no shame whatsoever.