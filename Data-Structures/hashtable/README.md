# Hashtables
#### Hashtables are a data structure that utilize key value pairs. This means every Node or Bucket has both a key, and a value.

<!-- Short summary or background information -->

## Challenge
#### The basic idea of a hashtable is the ability to store the key into this data structure, and quickly retrieve the value. This is done through what we call a hash. A hash is the ability to encode the key that will eventually map to a specific location in the data structure that we can look at directly to retrieve the value.
<!-- Description of the challenge -->

## Approach & Efficiency
#### Hash table have a very high Efficiency with having the endeces for value that we need to add the time and space complexity  will be O(1)
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->

## API
### In this code challenge we have the following methods:
#### 1. `add` this method will add a bucket to the hashtable with key and value and it's should to handle Collisions
#### 2. `get` this method take a key as an argument and return the value for that key
#### 3. `Contains` this method will accept a key, and return a bool on if that key exists inside the hashtable.
#### 4. `Hash` this method  will accept a key as a string, conduct the hash, and then return the index of the array where the key/value should be placed.
<!-- Description of each method publicly available in each of your hashtable -->
