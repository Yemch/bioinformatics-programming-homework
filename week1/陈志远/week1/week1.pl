use strict;
use warnings;

my $dna = "AGCTTTTCATTCTGACTGCAACGGGCAATATGTCTCTGTGTGGATTAAAAAAAGAGTGTCTGATAGCAGC";
my $countA = $dna=~tr/A/A/;
my $countT = $dna=~tr/T/T/;
my $countC = $dna=~tr/C/C/;
my $countG = $dna=~tr/G/G/;
print "A: $countA\n", "T: $countT\n",
 "C: $countC\n", "G: $countG\n";