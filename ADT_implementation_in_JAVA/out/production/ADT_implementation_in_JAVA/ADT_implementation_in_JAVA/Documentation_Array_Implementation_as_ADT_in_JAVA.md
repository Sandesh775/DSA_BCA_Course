📘 ARRAY ADT — CONCEPT NOTES (Future Reference)
===============================================

1️⃣ Core Definitions
====================

### 🔹 capacity

*   Total allocated memory.
    
*   Fixed at creation.
    
*   Does NOT change.
    
*   arr = new int\[5\];capacity = 5;
    

### 🔹 size

*   Number of elements currently stored.
    
*   Always starts at 0.
    
*   Changes with insert and delete.
    
*   Represents count — NOT last index.
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size = number of valid elements   `

2️⃣ Fundamental Invariant (Golden Rule)
=======================================

At all times:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   All valid elements are stored contiguously  from index 0 to size - 1.   `

There are **NO gaps allowed**.

This rule must never be broken.

3️⃣ Valid Ranges (Very Important)
=================================

If:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size = n   `

Then:

### 🔹 Valid element indexes:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   0 to n - 1   `

Used for:

*   get
    
*   deleteAt
    
*   search
    
*   update
    

Condition:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   0 <= index < size   `

### 🔹 Valid insertion positions:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   0 to n   `

Why n is allowed?

Because inserting at index == sizemeans inserting at the end (append).

Condition:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   0 <= index <= size   `

4️⃣ Important Difference
========================

### Access / Delete → work on ELEMENTS

### Insert → works on POSITIONS (gaps)

If there are n elements:

*   There are n elements
    
*   There are n + 1 insertion positions
    

Visual:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   _ A _ B _ C _  0   1   2   3   `

5️⃣ Insert at End
=================

Algorithm:

1.  Check overflow: size == capacity
    
2.  Place element at arr\[size\]
    
3.  Increment size
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   arr[size] = value;  size++;   `

6️⃣ Insert at Specific Index
============================

### Goal:

Make space at index.

### Key Concept:

Shift RIGHT before inserting.

Why RIGHT?To avoid overwriting values.

### Algorithm:

1.  0 <= index <= sizesize < capacity
    
2.  for (int i = size; i > index; i--) { arr\[i\] = arr\[i - 1\];}
    
3.  arr\[index\] = value;
    
4.  Increment size.
    

7️⃣ Delete from End
===================

Algorithm:

1.  Check underflow: size == 0
    
2.  Decrease size
    

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size--;   `

(Optional: arr\[size\] = 0; for cleanliness)

8️⃣ Delete at Specific Index
============================

### Goal:

Remove element and close the gap.

### Key Concept:

Shift LEFT after deleting.

Why LEFT?To fill the hole.

### Algorithm:

1.  0 <= index < size
    
2.  for (int i = index; i < size - 1; i++) { arr\[i\] = arr\[i + 1\];}
    
3.  Decrement size.
    

9️⃣ Doubts I Had (Important To Remember)
========================================

### ❓ Is size last index or count?

Answer:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size = count of elements  last index = size - 1   `

### ❓ Can I insert at arr\[4\] when size = 0?

No.

Because that would create gaps.

Array ADT requires:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   elements must always be contiguous from 0 to size-1   `

### ❓ Does insertion throw elements out?

No.

If:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size < capacity   `

then elements shift.

Nothing is lost.

If:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   size == capacity   `

insertion is rejected (overflow).

### ❓ Why insert allows index == size but delete does not?

Because:

*   Insert works on positions (n + 1 possible)
    
*   Delete works on elements (n possible)
    

### ❓ Why shift direction differs?

Insert → shift RIGHT (start from end)Delete → shift LEFT (start from index)

🔟 Mental Model To Remember
===========================

Think of array as:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   [ VALID ELEMENTS | EMPTY SPACE ]    0 → size-1      size → capacity-1   `

All operations must preserve:

Plain textANTLR4BashCC#CSSCoffeeScriptCMakeDartDjangoDockerEJSErlangGitGoGraphQLGroovyHTMLJavaJavaScriptJSONJSXKotlinLaTeXLessLuaMakefileMarkdownMATLABMarkupObjective-CPerlPHPPowerShell.propertiesProtocol BuffersPythonRRubySass (Sass)Sass (Scss)SchemeSQLShellSwiftSVGTSXTypeScriptWebAssemblyYAMLXML`   No gaps in VALID ELEMENTS region.   `

1️⃣1️⃣ Boundary Summary Table
=============================

OperationConditionget0 ≤ index < sizedeleteAt0 ≤ index < sizeinsertAt0 ≤ index ≤ sizeoverflowsize == capacityunderflowsize == 0

1️⃣2️⃣ Final Understanding
==========================

Capacity = storageSize = used storage / size of elements present

Insertion works on gaps.Deletion works on elements.

All valid elements must always remain continuous.