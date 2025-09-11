class Note:
    value = 0

    def __init__(self, value) -> None:
        self.value = value

    def __str__(self) -> str:
        return "notes of $" + str(self.value)

    def get_value(self):
        return self.value

class Wallet:
    all_notes = {}
    used_notes = {}
    note_values = [5, 10, 20, 50, 100]
    notes = [Note(value) for value in note_values]

    def __init__(self) -> None:
        for note in self.notes:
            self.all_notes[note] = 10
            self.used_notes[note] = 0

    def get_note_by_value(self,value):
        for note in self.notes:
            if note.value == value:
                return note
        return None

    def is_sufficient(self, price):
        myTotal = sum(self.note_values) * 10
        return myTotal >= price

    def pay(self, price):
        note_values = self.note_values
        note_values.reverse()
        for value in note_values:
            num_of_notes = price // value
            if num_of_notes <= 10:
                price = price % value
            else:
                num_of_notes = 10
                price = price - value * num_of_notes
            # without specifying the existing Note object, Note(value) will create a new Note object
            self.used_notes[self.get_note_by_value(value)] = num_of_notes

        if price > 0:
            self.used_notes[self.get_note_by_value(5)] = self.used_notes.get(self.get_note_by_value(5), 0) + 1

    def show(self):
        for note in self.used_notes:
            print("- used " + str(self.used_notes[note]) + " note of $" + str(note.get_value()))

my_wallet = Wallet()
price = int(input("Price: $"))
if my_wallet.is_sufficient(price):
    my_wallet.pay(price)
    my_wallet.show()
else:
    print("Insufficient funds!")