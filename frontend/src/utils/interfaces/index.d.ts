export interface DefaultResponse<T> {
  data: T;
  message: string;
}

export interface ICreateData {
  email: string;
  fullname: string;
  username: string;
  age: number;
}
