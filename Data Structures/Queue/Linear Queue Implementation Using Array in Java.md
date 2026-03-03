Documentation: Queue Implementation Using Array — A Comprehensive Guide
Understanding the Queue Data Structure
A queue is a linear data structure that follows the First In First Out (FIFO) principle, analogous to a line of people waiting for service—the first person to arrive is the first person served. The queue supports two primary operations: enqueue (adding an element to the rear) and dequeue (removing an element from the front). Additional operations include front or peek to view the front element without removing it, and isEmpty or isFull to check the queue's status.

The Core Challenge: Tracking Two Ends
Unlike a stack which only needs one pointer (top) because additions and removals happen at the same end, a queue requires managing two distinct positions—the front where elements are removed, and the rear where elements are added. This fundamental difference gives rise to multiple implementation approaches, each with its own pointer management strategy, trade-offs, and edge cases.

Approach 1: Shifting Implementation — Simplicity at a Cost
In the shifting approach, we maintain the invariant that the front of the queue is always at index 0. When an element is dequeued, all remaining elements are shifted left by one position, and the rear pointer is decremented. This approach has the distinct advantage of requiring only one pointer—rear alone suffices because the front is always known to be index 0. The empty condition becomes simply rear == 0, and the full condition is rear == capacity. Displaying the queue is straightforward: iterate from index 0 to rear-1.

However, this simplicity comes at a significant performance cost. Each dequeue operation requires shifting all remaining elements, making it an O(n) operation. For queues with many elements or frequent dequeues, this becomes prohibitively inefficient. The shifting approach is therefore primarily useful for educational purposes—it makes the queue's behavior visually clear—but is rarely used in production code where efficiency matters.

Approach 2: Pointer Movement Implementation — Efficiency Through Tracking
The more common and efficient approach uses two pointers: front pointing to the first element, and rear pointing to the next insertion position. When an element is enqueued, it is placed at the rear position and rear is incremented. When an element is dequeued, the value at front is retrieved and front is incremented—no shifting occurs, making dequeue an O(1) operation.

This efficiency introduces new complexities. The empty condition becomes front == rear, which requires careful handling because this same condition could also indicate a full queue in certain implementations. The display method must iterate from front to rear-1, not from index 0. Most significantly, this approach suffers from the "wasted space" problem: after several enqueue and dequeue operations, front moves forward, leaving unused space at the beginning of the array while rear reaches the end, creating the illusion of a full queue despite available space at the front.

Initialization Strategies: The Three Conventions
The pointer movement approach can be initialized in three different ways, each with its own logic for empty and full conditions:

Initialization		Empty Condition			First Enqueue				Advantages
front = 0, rear = 0	front == rear			Insert then increment			Intuitive, matches array indices
front = 0, rear = -1	size == 0 or front > rear	Increment then insert			Classic textbook approach
front = -1, rear = -1	front == -1			Set both to 0 on first insert		Elegant reset on empty
All three conventions are valid—they simply represent different internal representations of the same abstract concept. The choice between them is a matter of preference and consistency.

The Role of a Size Variable: Simplicity vs. Purity
A recurring question in queue implementation is whether to maintain a separate size variable. Without a size variable, empty and full conditions must be derived solely from pointer positions: front == rear indicates empty in the standard approach, but in circular queues this same condition could also mean full, requiring either a wasted slot or additional logic to distinguish between the two states.

With a size variable, empty becomes size == 0 and full becomes size == capacity—unambiguous conditions that work uniformly across all queue types, including circular queues. The size variable adds a small memory overhead (one integer) and requires updating on every enqueue and dequeue, but it dramatically simplifies logic and eliminates edge-case ambiguity. For beginners and for production code where clarity matters, using a size variable is strongly recommended.

Edge Cases Every Queue Implementation Must Handle
Regardless of the chosen approach, every robust queue implementation must address the following edge cases:

Dequeue from empty queue: Must detect and handle gracefully, typically by returning a sentinel value or throwing an exception

Enqueue to full queue: Must prevent overflow and notify the caller

Single element queue: After dequeuing the last element, pointers must be reset appropriately to maintain correct empty state

Front pointer reaching capacity: In linear queues, this indicates no more dequeues possible; in circular queues, it requires wrapping around

Queue becoming empty after operations: Should reset to a clean state to prevent pointer drift

Display Implementation: A Telltale Sign of Approach
The implementation of the display() method reveals which queue approach is being used:

For shifting approach (front always at 0): for(int i = 0; i < rear; i++)

For pointer approach (front moves): for(int i = front; i < rear; i++)

Attempting to use one display method with the other approach will produce incorrect output—a helpful debugging clue when working with queue implementations.

The Linear Queue Limitation and the Path Forward
All linear queue implementations—whether shifting or pointer-based—share a fundamental limitation: once rear reaches the end of the array, no more elements can be added even if space exists at the front. This limitation necessitates the circular queue, where pointers wrap around using modulo arithmetic, allowing reuse of vacated front positions. The circular queue represents the natural evolution from the linear queue concepts discussed here, resolving the space waste problem while maintaining O(1) operations.

Conclusion
The queue, despite its simple FIFO definition, offers rich implementation possibilities with distinct trade-offs. The shifting approach prioritizes conceptual simplicity at the cost of performance, while the pointer approach prioritizes performance at the cost of pointer management complexity. The choice of initialization convention and whether to maintain a size variable further shapes the implementation. Understanding these variations—and the edge cases each must handle—provides not just a working queue, but deep insight into how data structure choices impact behavior, performance, and code complexity.