Definition of Dynamic Array
A dynamic array is a data structure that provides array-like access with the ability to automatically resize itself when elements are added or removed, overcoming the fixed-size limitation of static arrays.

In One Sentence
A dynamic array uses a static array internally but automatically resizes when needed, providing the illusion of unlimited size while maintaining fast index-based access.

Core Characteristics
Feature	Description
Resizable			Can grow or shrink as elements are added/removed
Contiguous memory		Elements stored in consecutive memory locations (like static arrays)
Amortized O(1) insertion	Adding to end is usually constant time, occasionally O(n) when resizing
Index-based access		Random access in O(1) time
Automatic memory management	Resizing happens internally, invisible to user

How It Works Internally
An underlying static array is used for actual storage

Size variable tracks current number of elements

Capacity variable tracks maximum elements before resizing needed

When size reaches capacity, a new larger array is created and elements are copied

Dynamic Array vs Static Array
Aspect			Static Array					Dynamic Array
Size			Fixed at creation				Can grow/shrink
Memory allocation	Compile-time or stack				Runtime (heap)
Resizing		Manual (create new array, copy)			Automatic
Insertion at end	Manual tracking needed				Simple add() operation
Implementation		Built into language				Built on top of static array

Conclusion:
This is exactly how ArrayList works internally in java.