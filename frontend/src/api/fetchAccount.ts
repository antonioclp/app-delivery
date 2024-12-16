import { DefaultResponse, ICreateData } from '../utils/interfaces';

interface FetchCreateAccountProps {
  fullname: string;
  username: string;
  cpf: string;
  email: string;
  password: string;
  birthday: string;
}

export const fetchCreateAccount = async (
  account: FetchCreateAccountProps,
): Promise<DefaultResponse<ICreateData | null>> => {
};
