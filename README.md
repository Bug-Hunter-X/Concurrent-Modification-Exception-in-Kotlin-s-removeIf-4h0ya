# Concurrent Modification Exception in Kotlin's removeIf

This repository demonstrates a subtle bug that can arise when using the `removeIf` function on collections in Kotlin, particularly in concurrent environments. The seemingly straightforward `removeIf` operation can lead to a `ConcurrentModificationException` if not handled carefully.

## The Bug

The `removeIf` function iterates and modifies a collection simultaneously.  In a single-threaded environment, this typically works without issue. However, if another thread attempts to access or modify the collection during the `removeIf` operation, it can result in a `ConcurrentModificationException`.

## The Solution

The best way to avoid this issue is to create a copy of the collection before performing the `removeIf` operation.  This ensures that the original collection is not modified directly, preventing concurrency conflicts.
