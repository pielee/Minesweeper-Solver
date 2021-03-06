/*
The MIT License (MIT)

Copyright (c) 2015 Patrick Stillhart

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/
/**
 * Created by Patrick Stillhart on 26.12.2015.
 * <p>
 * The different states a block can have,
 * basically what you see.. like the numbers, flags, etc.
 */
public enum State {

    BLOCK_MINE_EXPLODED(-3),
    BLOCK_CLOSED(-2),
    BLOCK_FLAG(-1),
    BLOCK_EMPTY(0),
    BLOCK_ONE(1),
    BLOCK_TWO(2),
    BLOCK_THREE(3),
    BLOCK_FOUR(4),
    BLOCK_FIVE(5),
    BLOCK_SIX(6),
    BLOCK_SEVEN(7),
    BLOCK_EIGHT(8);

    private int val;

    State(int val) {
        this.val = val;
    }

    public int getVal() {
        return val;
    }

}
