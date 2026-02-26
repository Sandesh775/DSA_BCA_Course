📘 ARRAY ADT — CONCEPT NOTES (Future Reference)
1️⃣ Core Definitions

🔹 capacity

Total allocated memory.

Fixed at creation.

Does NOT change.

Example:

arr = new int[5];
capacity = 5;

🔹 size

Number of elements currently stored.

Always starts at 0.

Changes with insert and delete.

Represents count — NOT last index.

size = number of valid elements

2️⃣ Fundamental Invariant (Golden Rule)

At all times:

All valid elements are stored contiguously
from index 0 to size - 1.


There are NO gaps allowed.

This rule must never be broken.

3️⃣ Valid Ranges (Very Important)

If:

size = n


Then:

🔹 Valid element indexes:
0 to n - 1


Used for:

get

deleteAt

search

update

Condition:

0 <= index < size

🔹 Valid insertion positions:
0 to n


Why n is allowed?

Because inserting at index == size
means inserting at the end (append).

Condition:

0 <= index <= size

4️⃣ Important Difference
Access / Delete → work on ELEMENTS
Insert → works on POSITIONS (gaps)

If there are n elements:

There are n elements

There are n + 1 insertion positions

Visual:

_ A _ B _ C _
0   1   2   3

5️⃣ Insert at End

Algorithm:

Check overflow: size == capacity

Place element at arr[size]

Increment size

arr[size] = value;
size++;

6️⃣ Insert at Specific Index
Goal:

Make space at index.

Key Concept:

Shift RIGHT before inserting.

Why RIGHT?
To avoid overwriting values.

Algorithm:

Validate:

0 <= index <= size
size < capacity


Shift from right to left:

for (int i = size; i > index; i--) {
    arr[i] = arr[i - 1];
}


Place value:

arr[index] = value;


Increment size.

7️⃣ Delete from End

Algorithm:

Check underflow: size == 0

Decrease size

size--;


(Optional: arr[size] = 0; for cleanliness)

8️⃣ Delete at Specific Index
Goal:

Remove element and close the gap.

Key Concept:

Shift LEFT after deleting.

Why LEFT?
To fill the hole.

Algorithm:

Validate:

0 <= index < size


Shift left:

for (int i = index; i < size - 1; i++) {
    arr[i] = arr[i + 1];
}


Decrement size.

9️⃣ Doubts I Had (Important To Remember)
❓ Is size last index or count?

Answer:

size = count of elements
last index = size - 1

❓ Can I insert at arr[4] when size = 0?

No.

Because that would create gaps.

Array ADT requires:

elements must always be contiguous from 0 to size-1

❓ Does insertion throw elements out?

No.

If:

size < capacity


then elements shift.

Nothing is lost.

If:

size == capacity


insertion is rejected (overflow).

❓ Why insert allows index == size but delete does not?

Because:

Insert works on positions (n + 1 possible)

Delete works on elements (n possible)

❓ Why shift direction differs?

Insert → shift RIGHT (start from end)
Delete → shift LEFT (start from index)

🔟 Mental Model To Remember

Think of array as:

[ VALID ELEMENTS | EMPTY SPACE ]
  0 → size-1      size → capacity-1


All operations must preserve:

No gaps in VALID ELEMENTS region.

1️⃣1️⃣ Boundary Summary Table
Operation	Condition
get	0 ≤ index < size
deleteAt	0 ≤ index < size
insertAt	0 ≤ index ≤ size
overflow	size == capacity
underflow	size == 0
1️⃣2️⃣ Final Understanding

Capacity = storage
Size = storage used / total number of elements presented

Insertion works on gaps.
All valid elements must always remain continuous.
Deletion works on elements.

further more :-) 
Understanding or perspective on this : 

When we create our own MyArray class (with fields like size, capacity, and an internal array) and then define operations such as insert, delete, delete at end, delete at front, delete at given index, search element, find max/min, get element, or even sorting, and many more operations we are learning how to design an Abstract Data Type (ADT). An ADT separates what the structure does from how it is implemented. Instead of directly manipulating raw arrays everywhere in the program, we encapsulate the data and expose controlled operations. This gives us power: we can enforce rules (like not inserting when full), track size correctly, optimize operations, and extend functionality whenever needed. In essence, we are building a simplified version of something like Oracle’s ArrayList class inside the Java Collections Framework — but with full awareness of how it works internally. This knowledge is foundational because once you understand how to design an Array ADT, you can construct more advanced custom data structures like Stack (LIFO behavior), Queue (FIFO behavior), Deque, or even more complex structures. ADT thinking transforms you from someone who uses data structures into someone who can design and control them — which is the real power in Data Structures and Algorithms. I understand this as of creating both customize data type and custom data structure of our own at same time with same thing which can be known or define as ADT.
