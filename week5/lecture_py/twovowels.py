# Read a string from STDIN until * is entered
# Count and show the stretch of 2-vowels in the string (Matching words)
# A stretch of 2-vowels is: 
# -- a segment of a word after a z containing exactly 2 vowels 
# -- a word containing exactly 2 vowels
# Example: 
# String: azoooza azooza zoo azoo
# Matching words: 3
# String: GONZALEZ passes the ball to VAZQUEZ
# Matching words: 3 (here the segment ALE, word passes, segment QUE )
# String: azozozee
# Matching words: 1  (here the segment zee is the match)

# Break it down - build it up
# top level: show the matching words
# second level: break down sentence into words and count matches
# third level: break down a word into segments by z
# fourth level: count the vowels in a segment

def vowel_count(segment):
    count = 0
    for c in segment:
        if c in "aeiou":
            count +=1 
    return count 

def match(word):
    for segment in word.split("z"):
        if vowel_count(segment) == 2:
            return True
    return False

def word_count(sentence):
    count = 0
    for word in sentence.split(" "):
        if match(word):
            count +=1
    return count 

def show_matches():
    sentence = input("Sentence: ")
    
    while sentence != "*":
        print(f'Matching words = {word_count(sentence.lower())}')
        sentence = input("Sentence: ")
        
show_matches()
