package com.sl.future;

import java.util.Random;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

/**
 * @author shuliangzhao
 * @Title: CompletableFutureTest
 * @ProjectName design-parent
 * @Description: TODO
 * @date 2019/8/26 20:54
 */
public class CompletableFutureTest {

    public static void main(String[] args) throws Exception {
                                                            
        complateFuturAllOf();
    }

    public static void completableFutureGet() throws  Exception{
        CompletableFuture<Integer> completableFuture = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 100 * 1;
        });
        System.out.println(completableFuture.complete(1000));
        System.out.println(completableFuture.get());
        System.out.println(completableFuture.get(1000, TimeUnit.MICROSECONDS));
        System.out.println(completableFuture.join());
        System.out.println(completableFuture.getNow(1));
    }

    public static void completableFutureSupplyAsync()throws Exception {
        CompletableFuture<Void> future1 = CompletableFuture.runAsync(() -> System.out.println("runAsync"));
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "supplyAsync");

        System.out.println(future1.get());
        System.out.println(future2.get());
    }

    public static void completableFutureWhenComplete()throws Exception {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 20;
        }).whenCompleteAsync((v, e) -> {
            System.out.println(v);
            System.out.println(e);
        });
        System.out.println(future.get());
    }

    public static void completableFutureExceptionally()throws Exception {
        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return 10 / 0;
        }).whenCompleteAsync((v, e) -> {
            System.out.println(v);
            System.out.println(e);
        }).exceptionally((e) -> {
            System.out.println(e.getMessage());
            return 30;
        });
        System.out.println(future.get());
    }

    public static void completableFutureHand()throws Exception {

        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 10 / 0)
                .handle((t, e) -> {
                    System.out.println(e.getMessage());
                    return 10;
                });

        System.out.println(future.get());
    }

    public static void completableFutureThenApply()throws Exception {
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 1)
                .thenApply((a) -> {
                    System.out.println(a);//1
                    return a * 10;
                }).thenApply((a) -> {
                    System.out.println(a);//10
                    return a + 10;
                }).thenApply((a) -> {
                    System.out.println(a);//20
                    return a - 5;
                });
        System.out.println(future.get());//15
    }

    public static void completableFuturThenAccep()throws Exception {
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> 10)
                .thenAccept(System.out::println) //消费 上一级返回值 10
                .thenAcceptAsync(System.out::println); //上一级没有返回值 输出null
        System.out.println(future.get());//null
    }

    public static void complateFuturThenAcceptBoth() throws Exception {
        CompletableFuture
                .supplyAsync(() -> 10)
                .thenAcceptBoth(CompletableFuture.supplyAsync(() -> 20), (a, b) -> {
                    System.out.println(a);
                    System.out.println(b);
                }).get();
    }

    public static void complateFuturRunAfterBoth() throws Exception {
        System.out.println("开始");
        CompletableFuture<Void> future = CompletableFuture
                .supplyAsync(() -> {
                    System.out.println(10);
                    return 10;
                })
                .runAfterBoth(CompletableFuture.supplyAsync(() -> {
                    System.out.println(20);
                    return 20;
                }), () -> System.out.println("开始运行run"));
        System.out.println(future.get());
    }

    public static void complateFuturThenRun() throws Exception {
        CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello";
        }).thenRun(() -> System.out.println("hello world"));
        while (true){}
    }

    public static void complateFuturThenCompose() throws Exception {
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> 1)
                .thenApply((a) -> {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                    }
                    return a + 10;
                })
                .thenCompose((s) -> {
                    System.out.println(s); //11
                    return CompletableFuture.supplyAsync(() -> s * 5);
                });

        System.out.println(future.get());//55
    }

    public static void complateFuturThenCombine() throws Exception {
        Random random = new Random();
        CompletableFuture<Integer> future = CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("supplyAsync");
                    return 2;
                }).thenApply((a) -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thenApply");
                    return a * 3;
                })
                .thenCombine(CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("thenCombineAsync");
                    return 10;
                }), (a, b) -> {
                    System.out.println(a);
                    System.out.println(b);
                    return a + b;
                });

        System.out.println(future.get());
    }


    public static void complateFuturAcceptEither() throws Exception {
        Random random = new Random();
        CompletableFuture
                .supplyAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "A";
                })
                .acceptEither(CompletableFuture.supplyAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    return "B";
                }), System.out::println)
                .get();
    }

    public static void complateFuturApplyToEitherr() throws Exception {
        String result = CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "s1";
        }).applyToEither(CompletableFuture.supplyAsync(() -> {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "hello world";
        }), s -> s).join();
        System.out.println(result);
    }

    public static void complateFuturAllOf() throws Exception {
        Random random = new Random();
        CompletableFuture.allOf(
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(6000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(1);
                }),
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(2);
                }))
                .get();
    }

    public static void complateFuturAnyOf() throws Exception {
        Random random = new Random();
        Object o = CompletableFuture.anyOf(
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(4000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(1);
                }),
                CompletableFuture.runAsync(() -> {
                    try {
                        Thread.sleep(random.nextInt(1000));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(2);
                }))
                .get();
        System.out.println(o);
    }
}


