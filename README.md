# Welcome to battleship!
This project contains a very heavily stripped down version of battleship that I was challenged to create by a friend. We agreed that lines with only braces did not count, and neither did the object declaration line.

## How it works:
- Two randomly generated 5x5 boards with 5 ships each
- Computer logic that makes random hits every turn
- Player logic that asks for an X and Y coordinate (0 - 4) every turn
- Empty tiles = 0, your ships = 1, miss = 2, hit = 3

## Problems:
- Currently no logic to handle hitting the same tile twice. It will increment a tile more than once without any issue. Will fix later
- Code is run by a while loop with a break condition. Probably will fix later
