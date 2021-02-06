import {Trip} from "./trip/trip";

export interface User {
  id: number;
  firstName : string;
  lastName : string;
  email : string;
  address : string;
  purchasedTrips: Trip[];

}
function greeter(user: User): string {
  return 'Konto użytkownika:, ' + user.firstName + " " + user.lastName;
}
