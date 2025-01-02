package io.github.stream29.functionalaop.benchmark

import io.github.stream29.functionalaop.after
import io.github.stream29.functionalaop.before
import io.github.stream29.functionalaop.withAop
import org.openjdk.jmh.annotations.*
import java.util.concurrent.TimeUnit
import kotlin.math.abs

@Warmup(iterations = 5, time = 1)
@Measurement(iterations = 10, time = 1)
@BenchmarkMode(Mode.Throughput)
@OutputTimeUnit(TimeUnit.MILLISECONDS)
@State(Scope.Benchmark)
@Fork(1)
open class AopBenchmark {
    var index = 0
    val array = Array(1000) { it }
    fun safe(n: Int) = abs(n) % array.size

    fun f(n: Int): Int {
        array[index] = array[index] * array[index]
        index = safe(array[index])
        return array[index]
    }

    @Benchmark
    fun directCompose(): Int {
        array[index]++
        return array[safe(f(index))]++
    }

    @Benchmark
    fun functionalCompose(): Int {
        return withAop(
            before { array[index]++ },
            after { ret -> array[safe(ret)]++ }
        ) {
            f(index)
        }
    }
}