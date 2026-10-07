#!/usr/bin/env python3

import sys

for line in sys.stdin:
	key = line.split()[0]

	if key == "200":
		print("Reducer 0: ", line.strip())
	else:
		print("Reducer 1: ", line.strip())
