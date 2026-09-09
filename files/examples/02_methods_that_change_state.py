"""
METHODS THAT CHANGE THE OBJECT'S OWN STATE
=============================================
Week 3 taught you a function cannot reach outside itself and change your
variable. A method is the one exception - it CAN change its own object,
because self IS that object, not a copy of it.
Run:  python 02_methods_that_change_state.py
"""

# --- 1. A method can update self's attributes, and it sticks -----------

class Record:
    def __init__(self, label, value, limit):
        self.label = label
        self.value = value
        self.limit = limit
        self.checked = False       # starts False

    def mark_checked(self):
        self.checked = True         # this is a REAL, permanent change

r = Record("R-001", 87.0, 100.0)
print(r.checked)         # False

r.mark_checked()
print(r.checked)          # True - it actually changed, no return needed


# --- 2. Compare to Week 3's rule - this is genuinely different --------------
# A plain function cannot do this:

def try_to_change(price):
    price = price * 1.2     # only changes the LOCAL copy - lost when the
    return price              # function ends, unless you return and reassign

total = 100
try_to_change(total)
print(total)                  # still 100 - Week 3's rule held

# But a METHOD changing self really does change the object, because self
# is not a copy - it IS the object you called it on.


# --- 3. A running count, kept on the object itself ---------------------

class Checker:
    def __init__(self):
        self.over_limit_count = 0

    def check(self, value, limit):
        if value > limit:
            self.over_limit_count += 1     # updates and keeps the new total

c = Checker()
c.check(120, 100)
c.check(87, 100)
c.check(150, 100)
print(c.over_limit_count)     # 2 - the object remembered, across three calls


# --- 4. Why this is safe, not risky --------------------------------------
# The wall from Week 3 has not gone away - a method still cannot reach out
# and change something outside its own object. It can only change the one
# object it belongs to (self). That is still a wall - just a bigger room.


# --- TRY IT ------------------------------------------------------------------
# 1. Add a reset(self) method to Checker that sets over_limit_count back to 0.
# 2. Explain, in one sentence, why try_to_change(total) does not change
#    total, but r.mark_checked() does change r.
