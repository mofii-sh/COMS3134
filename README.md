## Data Structures and Algorithm Analysis - Chapter 1
### Selection Problem: determine the kth largest element
* sort the list in decreasing order, then return the kth element
* sort the first kth element in decreasing order, add the remaining element by comparing with the kth element, ignore it if it is smaller
* a better way?
### Optimization Efforts
### Series
* S = A^0 + A^1 + A^2 + ... + A^n + ... (0 < A < 1) <= 1 / (1 - A) [Geometric series]
* S = 1 / (2^1) + 2 / (2^2) + ... + n / (2^n) + ... = 2
* S = 1 + 2 + 3 + ... + n = n * (n + 1) / 2 => (n^2) / 2 [Arithmetic series]
* S = 1^2 + 2^2 + 3^2 + ... + n^2 = n * (n + 1) * (2n + 1) / 6 => (n^3) / 3
* S = 1^k + 2^k + 3^k + ... + n^k => (n^(k+1)) / |k + 1| (k != -1)
* Harmonic numbers: H<sub>N</sub> = 1 / 1 + 1 / 2 + 1 / 3 + ... + 1 / N => log<sub>e</sub>N tends to γ (Euler's constant: 0.57722)