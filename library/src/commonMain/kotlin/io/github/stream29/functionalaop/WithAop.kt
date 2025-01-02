package io.github.stream29.functionalaop

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>, noinline f: () -> R
) = aop0(f)()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(f))()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    crossinline aop2: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(aop2(f)))()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    crossinline aop2: AopHandler<R>,
    crossinline aop3: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(aop2(aop3(f))))()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    crossinline aop2: AopHandler<R>,
    crossinline aop3: AopHandler<R>,
    crossinline aop4: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(aop2(aop3(aop4(f)))))()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    crossinline aop2: AopHandler<R>,
    crossinline aop3: AopHandler<R>,
    crossinline aop4: AopHandler<R>,
    crossinline aop5: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(aop2(aop3(aop4(aop5(f))))))()

inline fun <R> withAop(
    crossinline aop0: AopHandler<R>,
    crossinline aop1: AopHandler<R>,
    crossinline aop2: AopHandler<R>,
    crossinline aop3: AopHandler<R>,
    crossinline aop4: AopHandler<R>,
    crossinline aop5: AopHandler<R>,
    crossinline aop6: AopHandler<R>,
    noinline f: () -> R
) = aop0(aop1(aop2(aop3(aop4(aop5(aop6(f)))))))()