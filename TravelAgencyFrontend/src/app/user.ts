import {Trip} from "./trip/trip";

export interface User {
  id: number;
  firstName: string;
  lastName: string;
  email: string;
  address: Address
  purchasedTrips: Trip[];


}

export interface Address {
  cityName: string;
  streetName: string;
  houseNumber: string;
  postalCode: string;

}

function greeter(user: User): string {
  return 'Konto użytkownika:, ' + user.firstName + " " + user.lastName;
}
