Imagine This Story

You have:

A big book = haystack
A small word you want to find = needle

Example:

haystack = "hello"
needle = "ll"


You want to know where "ll" starts in "hello".

Rabin-Karp Smart Idea

Instead of checking each letter again and again…

Convert words into numbers (hash values)
Compare numbers first
Only if numbers match → check letters

It’s like:

Instead of reading whole words, first check their fingerprints

Step-by-Step Code Breakdown
Step 1 — Store lengths
int M = needle.length(); 
int N = haystack.length();


M = size of small word
N = size of big word

Step 2 — If needle bigger than haystack
if(M>N)return -1;


Kid logic:

If your word is bigger than the book… you can’t find it inside.

Step 3 — Variables for hashing
int p = 0; // hash of needle
int t = 0; // hash of current window in haystack
int h = 1;
int d= 256; 
int q= 31;


Let’s explain like building fingerprint numbers:

d = 256

Represents total possible characters.

Think:

English keyboard has many characters → we assume 256 possibilities.

q = 31

Prime number helps avoid collisions.

Kid explanation:

Helps reduce two different words accidentally having same fingerprint.

p

Stores fingerprint of needle.

t

Stores fingerprint of current part of haystack.

h

Used to remove old characters when sliding window.

Step 4 — Convert strings into char arrays
char[] pat=needle.toCharArray();
char[] txt=haystack.toCharArray();


Why?

Easier and faster to access characters.

Step 5 — Calculate h
for (i = 0; i < M - 1; i++) 
    h = (h * d) % q;


Kid explanation:

Imagine:

You slide window like this 

[abc]de
 a removed → bcd


h helps remove "a" from hash quickly.

Step 6 — Calculate hash of needle & first window
for (i = 0; i < M; i++) { 
    p = (d * p + pat[i]) % q; 
    t = (d * t + txt[i]) % q; 
}


This builds fingerprint numbers.

Example:

"ll" → becomes number
"he" → becomes number


So now:

p = hash("ll")
t = hash("he")

Step 7 — Slide window over haystack
for (i = 0; i <= N - M; i++)


This moves window like:

he
el
ll
lo

Step 8 — Compare hash values
if ( p == t )


If fingerprints match…

Maybe words are same
So we check characters one by one

Step 9 — Character matching
for (j = 0; j < M; j++) { 
    if (txt[i+j] != pat[j]) 
        break; 
}


If full match:

if (j == M) 
    return i;


Found needle
Return starting index

Step 10 — Update hash for next window (MAGIC PART)
t = (d*(t - txt[i]*h) + txt[i+M])%q;


This means:

Remove first character
Add next character
Update fingerprint quickly

Without recalculating full substring.

Kid analogy:

Instead of counting all marbles again…

Remove one marble
Add new marble
Update total quickly

Step 11 — Fix negative hash
if (t < 0) 
    t = (t + q);


Because modulo sometimes gives negative numbers.

Full Flow Example
haystack = "hello"
needle = "ll"


Window slides:

he → hash compare 
el → 
ll →  match → return 2

Why Rabin-Karp Is Cool

Normal search:
Check every letter → slow

Rabin-Karp:
Compare fingerprint → fast skipping

Real Interview Insight

They mostly expect you to understand:

Sliding window
Hash building
Rolling hash update
Collision handling

Not memorizing formula.

One Thing That Confuses Everyone First Time

This line:

t = (d*(t - txt[i]*h) + txt[i+M])%q;


Is just:

Remove old char
Shift left
Add new char
